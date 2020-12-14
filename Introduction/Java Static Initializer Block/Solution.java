
import java.util.*;

/**
 * Output:
 * -1
 * 1
 * java.lang.Exception: Breadth and height must be positive
 *
 * 1
 * 3
 * 3
 *
 * @author martinfall
 */
public class Solution {

    private static int B;
    private static int H;
    private static boolean flag = true;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if (B <= 0 || H <= 0) {
            flag = false;
            try {
                throw new Exception();
            } catch (Exception ex) {
                System.out.println(ex
                        + ": Breadth and height must be positive");
            }
        }
    }

    public static void main(String[] args) throws Exception {

        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

