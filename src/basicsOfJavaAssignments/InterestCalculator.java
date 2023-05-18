package BasicsOfJavaAssignments;

public class InterestCalculator {
    public static void main(String[] args){
        String gender = args[0];
        int age = Integer.parseInt(args[1]);
        if(gender == "male") {

        }
            if((age >1) && (age < 120)){
                System.out.println("The percentage of interest is 8.3%");
        } else if (age< 58) {
                System.out.println("The percentage of interest is 7.6%");
            } else if (age>58) {
                System.out.println("THe percentage of interest is 9.2%");

            }

    }

    } 
}
