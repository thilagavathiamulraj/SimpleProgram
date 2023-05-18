package polymorphism;

public class CircleIF implements ShapeIF{

    int r=2;


    @Override
    public int calculateArea() {
        double circumference = 2*3.14*r;
        return (int) circumference;
    }
}
