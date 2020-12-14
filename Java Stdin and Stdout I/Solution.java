import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] numArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            numArray[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(numArray[i]);
        }
    }
}

