package polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        Animal[] animal = {cat, dog,};
        System.out.println(animal[0].makeSound());
        System.out.println(animal[1].makeSound());
    }
}
