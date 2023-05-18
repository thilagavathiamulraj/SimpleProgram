package inheritance;

public class Dog extends Animals {


    @Override
    String eat() {
        return "Dog eats meat";
    }

    @Override
    String sleep() {
        return "Dog snores while sleep";
    }
}
