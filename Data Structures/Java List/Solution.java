
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /**
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        // Create a scanner
        Scanner scanner = new Scanner(System.in);

        // Collect and validate N
        int N = scanner.nextInt();
        while (N < 1 || N > 4000) {
            N = scanner.nextInt();
        }

        // Create a new list L and fill with N validated user-entered values
        List<Integer> L = new ArrayList<>(N);
        while (L.size() != N) {
            L.add(scanner.nextInt());
        }

        // Collect and validate Q
        int Q = scanner.nextInt();
        while (Q < 1 || Q > 4000) {
            Q = scanner.nextInt();
        }

        // Consume the trailing new line characters
        scanner.nextLine();

        // Process the querries described in the Q operations and parameter pairs
        for (int i = 0; i < Q; i++) {
            String operation = scanner.nextLine();
            String params = scanner.nextLine();

            switch (operation) {
                case "Insert":
                    L.add(Integer.parseInt(params.split(" ")[0]),
                            Integer.parseInt(params.split(" ")[1]));
                    break;
                case "Delete":
                    L.remove(Integer.parseInt(params));
                    break;
            }
        }

        scanner.close(); // Close the scanner

        // Print the contents of L to the console
        for (Integer num : L) {
            System.out.print(num + " ");
        }
    }
}
