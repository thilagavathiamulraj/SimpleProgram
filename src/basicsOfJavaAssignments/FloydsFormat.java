package basicsOfJavaAssignments;

public class FloydsFormat {

    /**
     * Write a program to print * in floyds format (using for and while loop)
     */

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);
        System.out.println("Please enter the Number : "+number);
        for (int i = 1; i <= number; i++) {
            int j =0;
            while (j < i) {
                System.out.print("*");
                j++;
            }System.out.println();

        }
    }
}


