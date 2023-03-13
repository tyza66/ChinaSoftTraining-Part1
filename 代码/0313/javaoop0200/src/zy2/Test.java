package zy2;

public class Test {

    public static void main(String[] args) {

        Car car=new Car();
        car.brand="奔驰";
        car.color="商务黑";
        car.seats=5;

        car.showCar();


        Truck truck=new Truck("东风","红色",5.5f);
        truck.showTruck();
    }
}
