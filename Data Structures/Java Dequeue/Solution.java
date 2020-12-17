
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Create a new Scanner object
        Scanner in = new Scanner(System.in);

        // Create a new ArrayDeque object
        Deque deque = new ArrayDeque<>();

        // Collect and validate n, the total number of integers
        int n = in.nextInt();
        while (n < 1 || n > 100000) {
            n = in.nextInt();
        }

        // Create an int array for integer input 
        int[] arr = new int[n];

        // Collect and validate m, the size of the subarray
        int m = in.nextInt();
        while (m < 1 || m > 100000 || m > n) {
            m = in.nextInt();
        }

        // Populate the deque array with validated user input
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            while (num < 0 || num > 10000000) {
                num = in.nextInt();
            }
            deque.offer(num);
        }

        /**
         * Print the maximum number of unique integers among all possible
         * contiguous subarrays of size.
         */
        int maxUniqueIntegers = 0;
        for (int i = 0; i <= n - m; i++) {
            Deque<Integer> D = new ArrayDeque(deque);

            // Remove i from the front and n - m - i from the rear
            for (int j = 0; j < i && j < n - m; j++) {
                D.removeFirst();
            }
            for (int k = 0; k < n - m - i; k++) {
                D.removeLast();
            }
            int numOfUniqueIntegers = new HashSet(D).size();
            maxUniqueIntegers = maxUniqueIntegers < numOfUniqueIntegers
                    ? numOfUniqueIntegers : maxUniqueIntegers;
        }

        // Display the result to the console
        System.out.println(maxUniqueIntegers);
    }
}
