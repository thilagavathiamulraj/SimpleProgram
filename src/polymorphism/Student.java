package polymorphism;

public class Student extends Person{

    @Override
    String greet() {
        String s1 = "Welcome Students, Have a good day!";
        return s1;
    }
}
