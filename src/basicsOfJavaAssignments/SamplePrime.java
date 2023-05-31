package basicsOfJavaAssignments;

public class SamplePrime {

    /** Write a Java program to find if the given number is prime or not. */

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        if (number == 0 || number == 1) {
            System.out.println(number + " is neither prime nor composite");
        }
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + "is not a prime number");
            }

        }

    }
}