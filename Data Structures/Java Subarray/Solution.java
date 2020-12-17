
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /**
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        // Create a new scanner and collect input for the length of array A
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Validate n
        while (n < 1 || n > 100) {
            n = scanner.nextInt();
        }

        // Create a new array A 
        Integer[] A = new Integer[n];
        // Fill A with int values between -10^4 and 10^4 inclusive
        for (int i = 0; i < n; i++) {
            // Collect a new int value
            int value = scanner.nextInt();

            // Validate as mandated by constraints
            while (value < -10000 || value > 10000) {
                value = scanner.nextInt();
            }

            // Add validated value to A at index i
            A[i] = value;
        }

        scanner.close(); // Close the scanner

        // Process A and display the result in the console
        System.out.println(processArray(A));
    }

    /**
     * Recursive method to process an array.
     *
     * @param A
     * @return
     */
    public static int processArray(Integer[] A) {
        return processArray(A, 1, 0); // Call auxiliary recursive helper method
    }

    /**
     * Tail-recursive helper method to process array with a counter.
     *
     * @param A
     * @param subArraySize
     * @param counter
     * @return
     */
    public static int processArray(Integer[] A, int subArraySize, int counter) {
        // Base case is the subarray size is as large as the original array
        if (subArraySize > A.length) {
            return counter; // Return the value in counter
        } else {
            // For each index in a, if i < length and i + subArraySize is valid
            for (int i = 0; i < A.length && i + subArraySize <= A.length; i++) {
                // Create a subarray B using Arrays.asList->subList->toArray
                Integer[] B = Arrays.asList(A)
                        .subList(i, i + subArraySize)
                        .toArray(new Integer[0]);
                // Calculate the cum of all values in B
                if (sum(B) < 0) {
                    counter++; // Increment if the sum is negative
                }
            }
            // Return the value returned by a recursive call with subArraySize + 1
            return processArray(A, subArraySize + 1, counter);
        }
    }

    /**
     * Returns the sum of all the elements in the array B.
     *
     * @param B
     * @return
     */
    public static int sum(Integer[] B) {
        int sum = 0;
        for (Integer number : B) {
            sum += number;
        }
        return sum;
    }
}
