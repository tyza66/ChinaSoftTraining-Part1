package zy3;

public class TestVehicle {

    public static void main(String[] args) {

        Vehicle car=new Vehicle(100,5);

        car.show();
        car.speedUp();
        car.show();
        car.speedDown();
        car.show();
    }
}
