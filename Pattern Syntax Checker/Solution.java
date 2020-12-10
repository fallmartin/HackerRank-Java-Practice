
import java.util.Scanner;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            //Write your code
            boolean flag = true;
            try {
                Pattern p = Pattern.compile(pattern);
            } catch (PatternSyntaxException ex) {
                flag = false;
            } finally {
                System.out.println(flag ? "Valid" : "Invalid");
            }
            flag = true;
            testCases--;
        }
    }
}
