package polymorphism;

public class Rectangle extends Shape{

    int length = 3;
    int width = 4;

    @Override
    int calculateArea() {
        int area = length * width;
        return area;
    }
}
