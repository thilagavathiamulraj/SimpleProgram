package polymorphism;

public class TestVehicle {
    public static void main(String[] args){

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        Vehicle[] vehicle = {car,motorcycle};

        System.out.println(car.drive());
        System.out.println(motorcycle.drive());


    }
}
