package inheritance;

public class Square extends Shape {
    int length = 2;
    int width = 2;

    public static void main(String[] args) {
        Shape area = new Square();
        System.out.print(area.getArea());
    }
    @Override
    double getArea() {
        int area = length * width;

        return area;
    }
}
