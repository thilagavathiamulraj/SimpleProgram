package basicsOfJavaAssignments;

public class IdentifyAlphabetDigit {
/** Intialize a character variable in a program and if the value is alphabet then print
 * "Alphabet" if it’s a number then print "Digit" and for other characters print "Special
 *  Character"*/

    public static void main(String[] args){
        char a= args[0].charAt(0);

        if(Character.isAlphabetic(a)){
            System.out.println("The Given character is Alphabet");

        } else if (Character.isDigit(a)) {
            System.out.println("The given Character is Digit");

        }else{
            System.out.println("The given value is special Character ");
        }
    }
}
