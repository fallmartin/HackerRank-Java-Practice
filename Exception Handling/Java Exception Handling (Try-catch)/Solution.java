
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();

            System.out.println(number1 / number2);
        } catch (InputMismatchException ex) {
            System.out.println(ex.getClass().getName());
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
