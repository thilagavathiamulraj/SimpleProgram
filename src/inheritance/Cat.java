package inheritance;

public class Cat extends Animals {


    @Override
    String eat() {
        return "cat eats rat";
    }

    @Override
    String sleep() {
        return "cat snores while sleep";
    }
}
