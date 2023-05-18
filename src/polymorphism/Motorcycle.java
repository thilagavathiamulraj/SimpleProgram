package polymorphism;

public class Motorcycle extends Vehicle{


    @Override
    String drive() {
         String s1 = "Motorcycle has 2 wheels";
        return s1;
    }
}
