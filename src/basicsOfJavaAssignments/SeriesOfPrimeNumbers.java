package basicsOfJavaAssignments;

/** Write a program to print prime numbers between 10 and 99. */

public class SeriesOfPrimeNumbers {
    public static void main(String[] args){

        for(int i= 10; i <= 98 ;i++ ) {
            boolean isPrime = true;
            for(int j = 2; j < i ;j++){
                if(i%j == 0){
                    isPrime =false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
            }
        }
    }
}
