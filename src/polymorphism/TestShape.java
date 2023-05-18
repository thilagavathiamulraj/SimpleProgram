package polymorphism;

public class TestShape extends Shape {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape rectangle = new Rectangle();


        Shape[] shape = {circle, rectangle};

        System.out.println(shape[0].calculateArea());
        System.out.println(shape[1].calculateArea());

    }


    @Override
    int calculateArea() {
        return 0;
    }
}
