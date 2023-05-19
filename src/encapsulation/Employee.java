package encapsulation;

public class Employee {

    private String name;
    private int salary;
    private String hireDate;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setHireDate(String hireDate) {this.hireDate = hireDate; }

    public String getHireDate() {
        return this.hireDate;
    }



}


