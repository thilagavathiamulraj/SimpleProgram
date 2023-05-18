package polymorphism;

public class Circle extends Shape{
    int length = 2;
    int width = 4;

    @Override
    int calculateArea() {
        int area = (length * width);
        return area;
    }
}
