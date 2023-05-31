package basicsOfJavaAssignments;

// program to check if a given number is odd or even
public class OddOrEven {


    public static void main(String[] args){
        int i = Integer.parseInt(args[0]);
        if(i / 2 == 0) {    // Checks the condition

            System.out.println("The given number is Even");     // Prints the results
        }
        else
            System.out.println("The given number is odd");
    }
}
