package 定义一个交通工具类;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(1,2);
        System.out.println(vehicle.toString());
        vehicle.move();
        vehicle.speedUp();
        System.out.println(vehicle.toString());
        vehicle.speedDown();
        System.out.println(vehicle.toString());
        vehicle.setSpeed(999);
        System.out.println(vehicle.toString());
    }
}
