package basicsOfJavaAssignments;

/** Write a program to convert from upper case to lower case and vice versa of an alphabet
 and print the old character and new character as shown in example (Ex: a->A, M->m). */

public class CharConversion {

    public static void main(String[] args){

        String s1 = "Samsung"; // lowercase string value

        String s2 = "DELL"; // uppercase string value
        String uppercase =s1.toUpperCase(); // convert s1 to uppercase
        String lowercase = s2.toLowerCase(); // convert s2 to lowercase

        System.out.println(s1.toUpperCase()); // Printing the Converted uppercase String value
        System.out.println(s2.toLowerCase()); // Printing the converted lowerCase String value

    }

}
