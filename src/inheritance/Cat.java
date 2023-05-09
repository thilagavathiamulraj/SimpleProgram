package inheritance;

public class Cat extends Animals {

    public static void main(String[] args) {
        Animals cat = new Cat();


        System.out.println(cat.eat());
        System.out.println(cat.sleep());
    }
        @Override
        String eat () {
            return "rat";
        }

    @Override
    String sleep() {
        return "snore";
    }
}
