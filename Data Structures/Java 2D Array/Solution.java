
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Input:
 * -1 -1 0 -9 -2 -2
 * -2 -1 -6 -8 -2 -5
 * -1 -1 -1 -2 -3 -4
 * -1 -9 -2 -4 -4 -5
 * -7 -3 -3 -2 -9 -9
 * -1 -3 -1 -2 -4 -5
 *
 * Output:
 * -6
 *
 * @author martinfall
 */
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        // Create a new variable to hold the largest sum
        // Initialize it to the first sum in the array
        int largestSum = arr[0][0] + arr[0][1] + arr[0][2]
                + arr[1][1]
                + arr[2][0] + arr[2][1] + arr[2][2];;

        // Loop through the array and sum the values
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr.length - 3; j++) {
                int currentSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                // Compare the current sum to the largest sum
                if (currentSum > largestSum) {
                    largestSum = currentSum;
                }
            }
        }

        // Display the results to the console
        System.out.println(largestSum);
    }
}
