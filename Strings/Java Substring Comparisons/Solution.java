
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        // Create an array of Strings at the corrent length 
        String[] array = new String[s.length() - k + 1];

        // Populate the array with substrings of order k
        for (int i = 0; i < array.length; i++) {
            array[i] = s.substring(i, i + k);
        }

        // Sort array in ascending lexicographical order using selection sort
        for (int i = 0; i < array.length - 1; i++) {
            String currentMin = array[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (currentMin.compareTo(array[j]) > 0) {
                    currentMin = array[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                String temp = array[i];
                array[i] = array[currentMinIndex];
                array[currentMinIndex] = temp;
            }
        }

        // Assign the first and last array elements to smallest and largest vars
        smallest = array[0];
        largest = array[array.length - 1];

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
