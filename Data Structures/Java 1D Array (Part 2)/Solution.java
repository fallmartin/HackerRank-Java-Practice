
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWin(leap, game, 0);
    }

    private static boolean canWin(int leap, int[] game, int i) {
        // Base Cases
        if (i >= game.length) { // Winning case
            return true;
        } else if (i < 0 || game[i] == 1) { // Disturbance in the force
            return false;
        }

        game[i] = 1; // marks as visited

        // Recursive Cases
        return canWin(leap, game, i - 1)
                || canWin(leap, game, i + leap)
                || canWin(leap, game, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
