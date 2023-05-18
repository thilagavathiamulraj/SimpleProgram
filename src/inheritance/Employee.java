package inheritance;

public class Employee extends Person {
    int salary = 10000;
    public static void main(String[] args){
        Employee employee = new Employee();
        System.out.print("Employee salary is = ");
        System.out.println(employee.getSalary());
    }
    @Override
    int getSalary(){
        return salary;
    }

}
