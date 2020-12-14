
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import org.w3c.dom.html.HTMLElement;

/**
 * A huge thanks to Rodney Shaghoulian for sharing his regex.
 *
 * @author martinfall
 */
public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            // Create a new regex to match the program reqs
            String regex = "<(?<startTag>.+)>" // start tag
                    + "(?<content>[^<]+)" // content
                    + "(</\\k<startTag>>)"; // end tag

            // Compile a new pattern
            Pattern pattern = Pattern.compile(regex);

            // Return a matcher object from the pattern object's matcher method
            Matcher matcher = pattern.matcher(line);

            // Create a boolean flag and set it to false
            boolean matchFound = false;

            // While instead of if to support multiple matches per line
            while (matcher.find()) {
                // Print the nested text
                System.out.println(matcher.group("content"));

                // Set flag to true
                matchFound = true;
            }
            // Print None if no matches are found
            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;

        }
    }
}
