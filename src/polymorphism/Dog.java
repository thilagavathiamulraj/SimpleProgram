package polymorphism;

import inheritance.Animals;

public class Dog extends Animal {


    @Override
    String makeSound() {
        return "Bow Bow";
    }
}
