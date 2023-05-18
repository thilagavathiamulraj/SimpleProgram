package polymorphism;

public class RectangleIF implements ShapeIF{

    int length = 3;
    int width = 5;

    @Override
    public int calculateArea() {
        int area = length* width;
        return area;
    }
}
