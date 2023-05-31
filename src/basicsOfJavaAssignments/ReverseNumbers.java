package basicsOfJavaAssignments;

public class ReverseNumbers {
    public static void main(String[] args) {

        /** Write a program to reverse a given number and print Eg1) I/P: 1234 O/P:4321 Eg2)
         I/P:1004 O/P:4001 */
        int number = Integer.parseInt(args[0]);
        int remainder, revNumber = 0;

        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            revNumber = (revNumber * 10) + remainder;
        }
        System.out.print(revNumber);
    }
}
