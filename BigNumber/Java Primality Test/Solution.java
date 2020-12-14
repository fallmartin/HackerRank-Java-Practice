
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Solution class for HackerRank exercises.
 *
 * @author martinfall
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Main method.
     *
     * @param args
     */
    public static void main(String[] args) {
        String n = scanner.nextLine();

        // n contains at most 100 digits
        while (n.length() > 100) {
            n = scanner.nextLine();
        }

        // Create a new big integer
        BigInteger bigInteger = new BigInteger(n);

        // If n is a prime number, print prime; otherwise, print not prime.
        System.out.println(bigInteger.isProbablePrime(1) ? "prime" : "not prime");

        scanner.close();
    }
}
