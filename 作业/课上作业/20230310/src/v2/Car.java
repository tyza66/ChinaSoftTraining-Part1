package v2;

public class Car extends Vehicles {
    int seats;

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public void showCar(){
        System.out.println("这辆小车的座位数量是："+seats+" 品牌："+brand+" 颜色："+color);
    }
}
