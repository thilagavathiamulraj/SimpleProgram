package inheritance;

public class TestAnimal{

    public static void main(String[] args) {
        Animals cat = new Cat();
        Animals dog = new Dog();

        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        System.out.println(dog.eat());
        System.out.println(dog.sleep());


    }

}
