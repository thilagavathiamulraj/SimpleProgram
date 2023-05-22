package arraylist;

public class Employee {

    int id;
   private String name;
    private String email;
    private char gender;
    private float salary;

    public void setId(int id ) { this.id = id; }
    public int getId() { return this.id; }
    public void setName(String name ) { this.name  = name; }
    public String getName() { return this.name; }
    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return this.email; }
    public void setGender(char gender) { this.gender = gender; }
    public  char getGender() { return this.gender; }
    public void setSalary( float salary) { this.salary = salary; }
    public float getSalary() { return this.salary; }

}
