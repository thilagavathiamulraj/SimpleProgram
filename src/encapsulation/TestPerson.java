package encapsulation;


public class TestPerson {

    /**Create a class called Person that has private variables name, age, and address.
     * Create public methods to access and modify these variables,
     * such  getName(), getAge(), getAddress(), setName(), setAge(), and setAddress().
     * Make sure that the age variable can only be set to a value between 0 and 120.*/

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Daniel");
        p1.setAge(40);
        p1.setAddress("Texas");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getAddress());


  }
}
