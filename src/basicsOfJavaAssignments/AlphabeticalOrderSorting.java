package basicsOfJavaAssignments;


/** Initialize two character variables in a program and display the characters in alphabetical
 order. Eg1) if first character is s and second is e O/P: e,s Eg2) if first character is a and
 second is e O/P:a,e */

public class AlphabeticalOrderSorting {
    public static void main(String[] args){
        char i = 's',j = 'k';
        if(i<j){
            System.out.println(i);
            System.out.println(j);
        }else {
            System.out.println(j);
            System.out.println(i);
        }

    }
}
