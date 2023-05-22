package arraylist;


import java.util.*;

public class EmployeeManagement {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // employee 1 detail
        Employee emp1 = new Employee();
        emp1.setId(1);
        emp1.setName("John");
        emp1.setEmail("john@test.com");
        emp1.setGender('M');
        emp1.setSalary(120000F);
        employees.add(emp1);

        // employee 2 details
        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Clarie");
        emp2.setEmail("Clarie@test.com");
        emp2.setGender('F');
        emp2.setSalary(200000.0F);
        employees.add(emp2);

        System.out.println("Employee details");
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getEmail() + " " + employee.getGender() + " " + employee.getSalary());
        }
    }
}
