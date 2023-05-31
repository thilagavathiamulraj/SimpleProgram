package basicsOfJavaAssignments;

/** Write a program to check if a given number is prime or not */

public class PrimeOrNot {
    public static void main(String[] args) {
       int num = Integer.parseInt(args[0]);

       boolean isPrime = true;
       for( int i = 2; i < num; i++) {
           if(num % 2 == 0){
               isPrime = false;
               break;
           }
        }
       if(isPrime) {
           System.out.println(num+" is a Prime Number");
       } else {
           System.out.println(num+" number is not a prime");
       }

    }

}
