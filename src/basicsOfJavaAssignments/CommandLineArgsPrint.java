package basicsOfJavaAssignments;


// This program is to display the Command Line Arguments value with comma symbol
public class CommandLineArgsPrint {

    public static void main(String[] args) {


        if (args.length == 0) {
            System.out.println("There is no Values in command line");
        } else {

            /**for (String i : args) {
                System.out.print(i + ",");

            }*/

            for(int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if(i != args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}
