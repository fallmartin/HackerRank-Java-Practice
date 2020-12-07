
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A) ? "Yes" : "No");

    }

    public static boolean isPalindrome(String string) {
        return isPalindrome(string, 0, string.length() - 1);
    }

    public static boolean isPalindrome(String string, int low, int high) {
        if (high <= low) { // Base case
            return true;
        } else if (string.charAt(low) != string.charAt(high)) {
            return false;
        } else {
            return isPalindrome(string, low + 1, high - 1);
        }
    }
}
