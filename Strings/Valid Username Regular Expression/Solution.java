
import java.util.Scanner;

/**
 * Input:
 * 8
 * Julia
 * Samantha
 * Samantha_21
 * 1Samantha
 * Samantha?10_2A
 * JuliaZ007
 * Julia@007
 * _Julia007
 *
 * Output:
 * Invalid
 * Valid
 * Valid
 * Invalid
 * Invalid
 * Valid
 * Invalid
 * Invalid
 *
 * @author martinfall
 */
public class Solution {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        System.out.println();

        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {

    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z][0-9_|a-zA-Z]{7,29}$";
}
