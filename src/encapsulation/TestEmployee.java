package encapsulation;

public class TestEmployee {

    public static void main(String[] args){
       // Create a class called Employee that has private variables name, salary, and hireDate.
        // Create public methods to access and modify these variables,
        // Such as getName(), getSalary(), getHireDate(), setName(), setSalary(), and setHireDate().
        // Make sure that the salary variable can only be set to a value greater than 0.

        Employee emp = new Employee();
        emp.setName("Kate");
        emp.setSalary(10000);
        emp.setHireDate("04-July-2011");
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getHireDate());


    }

}
