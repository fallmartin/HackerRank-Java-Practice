
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Input:
 * 5
 * 5 41 77 74 22 44
 * 1 12
 * 4 37 34 36 52
 * 0
 * 3 20 22 33
 * 5
 * 1 3
 * 3 4
 * 3 1
 * 4 3
 * 5 5
 *
 * Output:
 * 74
 * 52
 * 37
 * ERROR!
 * ERROR!
 *
 * @author martinfall
 */
public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Collect and validate the number of lines n
        int n = scanner.nextInt();
        while (n < 1 || n > 20000) { // while n is not valid, collect new input
            n = scanner.nextInt();
        }

        // Create and populate a new array list
        ArrayList<Integer[]> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // Collect the number of integers on this line d
            int d = scanner.nextInt();

            // If d is not valid, collect new input until a valid value is entered
            while (d < 0 || d > 50000) {
                d = scanner.nextInt();
            }

            // After validating the input for d, create a new array of Integers
            Integer[] line = new Integer[d + 1];
            line[0] = d; // Add d at index 0 of line

            // Collect d Integer objects
            for (int j = 1; j < line.length; j++) {
                line[j] = scanner.nextInt();
            }
            // Add the line to the arraylist of lines
            arrayList.add(line);
        }

        // Collect and validate the number of queries q
        int q = scanner.nextInt();

        // If q is not valid, collect new input until a valid value is entered
        while (q < 1 || q > 1000) {
            q = scanner.nextInt();
        }

        while (q-- > 0) {
            // Collect and validate two integers x and y
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x >= 1 && x <= n
                    && arrayList.get(x - 1).length > y) {
                System.out.println(arrayList.get(x - 1)[y]);
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
