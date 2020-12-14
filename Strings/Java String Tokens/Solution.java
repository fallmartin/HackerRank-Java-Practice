
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        String trimmedString = s.trim();
        boolean validString = trimmedString.matches("[A-Za-z !,?._'@]+");
        boolean validLength = (trimmedString.length() >= 1
                && trimmedString.length() <= 400000);

        if (validString && validLength) {
            String[] tokens = trimmedString.split("[!,?._'@\\W]+");
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }

        scan.close();
    }
}
