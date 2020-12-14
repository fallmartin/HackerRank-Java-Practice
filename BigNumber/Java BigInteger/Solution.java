
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Solution class for HackerRank exercises.
 *
 * @author martinfall
 */
public class Solution {

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Create a BigInteger array for a and b
        BigInteger[] operands = new BigInteger[2];

        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Collect two lines of input from the user
        for (int i = 0; i < 2; i++) {
            String number = scanner.nextLine();

            // inputs are non-negative integers and can have maximum 200 digits
            while (number.charAt(0) == '-' || number.length() > 200) {
                // System.out.println("Input not accepted. Try again.");
                number = scanner.nextLine();
            }

            // System.out.println("Input accepted.");
            operands[i] = new BigInteger(number);
        }

        // Close the Scanner
        scanner.close();

        System.out.println(operands[0].add(operands[1]));
        System.out.println(operands[0].multiply(operands[1]));
    }
}
