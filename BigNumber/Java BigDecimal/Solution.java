
import java.math.BigDecimal;
import java.util.*;

/**
 * Input (stdin)
 *
 * 9
 * -100
 * 50
 * 0
 * 56.6
 * 90
 * 0.12
 * .12
 * 02.34
 * 000.000
 *
 * Output (stdout)
 * 90
 * 56.6
 * 50
 * 02.34
 * 0.12
 * .12
 * 0
 * 000.000
 * -100
 *
 * @author martinfall
 */
public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String[] s = new String[n + 2];
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - i - 1; j++) {
                if (s[j] == null || s[j + 1] == null) {
                    break;
                } else if (new BigDecimal(s[j]).compareTo(
                        new BigDecimal(s[j + 1])) == -1) {
                    String temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        System.out.println();

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}
