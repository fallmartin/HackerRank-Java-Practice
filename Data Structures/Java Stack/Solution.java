
import java.util.*;

class Solution {

    public static void main(String[] argh) {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // While input is being collected
        while (scanner.hasNext()) {
            // Store a token in the String variable input
            String input = scanner.next();
            // Create a new char array from the contents of input
            char[] charArray = input.toCharArray();
            // Declare and initialize a new Stack object
            Stack<Character> stack = new Stack<>();

            // For each character in the char array
            for (char c : charArray) {
                // If the stack is empty
                if (stack.isEmpty()) {
                    stack.push(c); // Push c
                } else { // Otherwise match c to the peeked value in stack and pop if matched
                    if (stack.peek() == '(' && c == ')') {
                        stack.pop();
                    } else if (stack.peek() == '{' && c == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c == ']') {
                        stack.pop();
                    } else { // If none of this is true, push c
                        stack.push(c);
                    }
                }
            }

            // Display true/false to console according to the contents of the stack
            System.out.println(stack.isEmpty() ? "true" : "false");
        }

    }
}
