package inheritance;

public class Dog extends Animals {

    public static void main(String[] args){
        Animals dog = new Dog();

        System.out.println(dog.eat());
        System.out.println(dog.sleep());
    }
    @Override
    String eat() {
        return "meat";
    }

    @Override
    String sleep() {
        return "snore";
    }
}
