
import java.util.Arrays;
import java.util.Scanner;

/**
 * List
 * tisl
 * [l1, i1, s1, t1]
 * [t1, i1, s1, l1]
 * [i1, l1, s1, t1]
 * [i1, l1, s1, t1]
 * Anagrams
 *
 * @author martinfall
 */
public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        String str1 = process(a.toLowerCase());
        String str2 = process(b.toLowerCase());

        String[] array1 = new String[str1.length() / 2];
        String[] array2 = new String[str2.length() / 2];

        String temp = "";
        int counter = 0;
        int index = 0;

        for (char c : str1.toCharArray()) {
            temp = temp + c + "";
            counter++;

            if (counter == 2) {
                array1[index] = temp;
                counter = 0;
                temp = "";
                index++;
            }
        }

        temp = "";
        counter = 0;
        index = 0;

        for (char c : str2.toCharArray()) {
            temp = temp + c + "";
            counter++;

            if (counter == 2) {
                array2[index] = temp;
                counter = 0;
                temp = "";
                index++;
            }
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        array1 = sort(array1);
        array2 = sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static String process(String a) {
        String str = "";
        int counter = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (str.contains(String.valueOf(c))) {
                continue;
            } else {
                for (int j = 0; j < a.length(); j++) {
                    if (c == a.charAt(j)) {
                        counter++;
                    }
                }
            }
            str += String.valueOf(c) + counter;
            counter = 0;
        }
        return str;
    }

    public static String[] sort(String[] array) {
        String[] sortedArray = array.clone();

        for (int i = 0; i < sortedArray.length - 1; i++) {
            for (int j = i; j < sortedArray.length; j++) {
                if (sortedArray[i].compareTo(sortedArray[j]) > 0) {
                    String temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
