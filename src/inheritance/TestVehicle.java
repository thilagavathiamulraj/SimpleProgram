package inheritance;

public class TestVehicle {

    public static void main(String[] args){
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        System.out.println(car.drive());
        System.out.println(truck.drive());

    }
}
