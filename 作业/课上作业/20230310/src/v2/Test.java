package v2;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("1","2",3);
        Truck truck = new Truck("4","5",6);
        car.showCar();
        car.showInfo();
        car.run();

        truck.showTruck();
        truck.showInfo();
        truck.run();
    }
}
