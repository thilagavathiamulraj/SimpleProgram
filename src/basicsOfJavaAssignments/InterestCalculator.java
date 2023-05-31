package basicsOfJavaAssignments;


/** Write a program to accept gender ("Male" or "Female") and age (1-120) from command
 line arguments and print the percentage of interest based on the given conditions.
 Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==>
 Female Age ==>59 -120 Interest == 9.2% Gender ==> Male Age ==>1-60 Interest ==
 8.3% Gender ==> Male Age ==>61-120 */

public class InterestCalculator {
    public static void main(String[] args) {

        //** Write a program to display the percentage of interest

        String gender = args[0];

        int age = Integer.parseInt(args[1]); //* Converting age to integer

        if (gender.equals("male")) {
            if ((age >= 1) && (age <= 120)) {
                System.out.println("The percentage of interest is 8.3%");
            }else{
                System.out.println("Please enter the age above 1 and below 120");
            }
        } else if (gender.equals("female")) {
            if ((age >= 1) && (age <= 58)) {
                System.out.println("The percentage of interest is 7.6");
            } else if ((age >= 59) && (age <= 120)) {
                System.out.println("THe percentage of interest is 9.2%");
            }
        } else {
            System.out.println("Gender is unknown");
        }
    }
}




