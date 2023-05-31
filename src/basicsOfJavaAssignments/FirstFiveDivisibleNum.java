package basicsOfJavaAssignments;

/**  Initialize two character variables in a program and display the characters in alphabetical
 order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
 second is e O/P:a,e  */
public class FirstFiveDivisibleNum {

    public static void main(String args[]){
        int number = 0;
        int a = 30;
        while(number < 5) {
            if(a % 5 == 0 && a % 3 == 0 && a % 2 == 0) {
                System.out.println(a);
                number++;
            }
            a++;
        }
    }
}
