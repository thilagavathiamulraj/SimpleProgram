package polymorphism;

public class TestShapeIF {
    public static void main(String[] args){

        ShapeIF circle = new CircleIF();
        ShapeIF rectangle = new RectangleIF();

        ShapeIF[] shapeIF = {circle,rectangle};

        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());



    }
}
