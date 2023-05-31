package basicsOfJavaAssignments;

/** Write a Java program to find if the given number is palindrome or not **/

public class PalindromeNumber {

    public static void main(String[] args){
         int number = Integer.parseInt(args[0]);
         int remainder, revNumber = 0;
         int orgNumber = number;
         System.out.println("Enter the number to check the palindrome "+number);

         while(number>0){
             remainder = number%10;
             number = number/10;
             revNumber =(revNumber*10) + remainder;
         }if(orgNumber == revNumber) {
            System.out.println("The given number is a Palindrome");
        }else {
            System.out.println("The given number is not a palindrome");
        }

    }
}
