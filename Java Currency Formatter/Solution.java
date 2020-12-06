
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Output:
 * 12324.134
 * US: $12,324.13
 * India: ₹12,324.13
 * China: ¥12,324.13
 * France: 12 324,13 €
 *
 * @author martinfall
 */
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale lIndia = new Locale("en", "IN");

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nfUS.format(payment);

        NumberFormat nfIN = NumberFormat.getCurrencyInstance(lIndia);
        String india = nfIN.format(payment);

        NumberFormat nfCH = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfCH.format(payment);

        NumberFormat nfFR = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFR.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
