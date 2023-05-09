package inheritance;

public class Rectangle extends Shape {
    int length = 2;
    int width = 4;

    public static void main(String[] args){
        Shape area = new Rectangle();
        System.out.println(area.getArea());
    }
    @Override
    double getArea() {
        int area = length * width;
        return area;
    }
}
