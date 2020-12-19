
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /**
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Collect and validate the length N of both BitSets B1 and B2
        int N = scanner.nextInt();
        while (N < 1 || N > 1000) {
            N = scanner.nextInt();
        }
        // Collect and validate the number M of operations to perform
        int M = scanner.nextInt();
        while (M < 1 || M > 10000) {
            M = scanner.nextInt();
        }

        scanner.nextLine(); // Read the leftover new line

        // Create two BitSet objects B1 and B2
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        // For each operation entered by user
        for (int i = 0; i < M; i++) {
            // Collect a line and split it into 3 tokens
            String line = scanner.nextLine();
            String[] ops = line.split("\\s"); // white space delimiter

            // Switch the type of operation
            switch (ops[0]) {
                case "AND": // AND
                    if (ops[1].equals("1") && ops[2].equals("2")) {
                        B1.and(B2);
                    } else if (ops[1].equals("2") && ops[2].equals("1")) {
                        B2.and(B1);
                    }
                    break;
                case "OR": // OR
                    if (ops[1].equals("1") && ops[2].equals("2")) {
                        B1.or(B2);
                    } else if (ops[1].equals("2") && ops[2].equals("1")) {
                        B2.or(B1);
                    }
                    break;
                case "XOR": // XOR
                    if (ops[1].equals("1") && ops[2].equals("2")) {
                        B1.xor(B2);
                    } else if (ops[1].equals("2") && ops[2].equals("1")) {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP": // FLIP
                    if (ops[1].equals("1")) {
                        B1.flip(Integer.parseInt(ops[2]));
                    } else if (ops[1].equals("2")) {
                        B2.flip(Integer.parseInt(ops[2]));
                    }
                    break;
                case "SET": // SET
                    if (ops[1].equals("1")) {
                        B1.set(Integer.parseInt(ops[2]));
                    } else if (ops[1].equals("2")) {
                        B2.set(Integer.parseInt(ops[2]));
                    }
                    break;
            }

            // Print the respective number of set bits in B1 and B2
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
    }
}
