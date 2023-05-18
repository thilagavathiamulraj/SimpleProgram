package polymorphism;

public class Teacher extends Person{

    @Override
    String greet() {
        String t1 = "Welcome Teachers, Have a good day!";
        return t1;
    }
}
