package v1;

public class CatTest {
    public static void main(String[] args) {
        Car car = new Car(123,"giao","blue",99);
        car.setSpeed(999);
        car.setColor("Red");
        System.out.println(car.getPassenger());
        System.out.println(car.getColor());
        System.out.println(car.getKind());
    }
}
