package basicsOfJavaAssignments;

import java.util.Arrays;
/** Initialize two character variables in a program and display the characters in alphabetical
 order.*/
public class CharSorting {
    public static void main(String[] args) {

        // Create an Array of Char

        char[] key = new char[]{'B', 'S', 'C'};

        // Print the given character

        for (int i = 0; i < key.length; i++) {
            System.out.print(key[i]);
        }
            System.out.println();
        // Character Sorting

        Arrays.sort(key);

        for (int j = 0; j < key.length; j++) {
            System.out.print(key[j]);

        }
    }
}
