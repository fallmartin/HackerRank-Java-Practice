//Complete this code or write your own from scratch

import java.util.*;
import java.io.*;

class Solution {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        // Create a new Map
        Map<String, Integer> phonebook = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phonebook.put(name, phone); // Add key,value to mape
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            // Find the k,v pair or return Not found
            if (phonebook.containsKey(s)) {
                System.out.println(s + "=" + phonebook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
