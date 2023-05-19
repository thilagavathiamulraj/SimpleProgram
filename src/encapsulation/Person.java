package encapsulation;

public class Person {
    private String name;
    private int age;

    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setAge(int age) {

        if (age >=0 && age <= 120) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void  setAddress(String address) {this.address = address;}

    public String getAddress() { return this.address;}
}
