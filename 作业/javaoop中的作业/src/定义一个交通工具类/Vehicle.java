package 定义一个交通工具类;

public class Vehicle {
    double speed;
    double size;

    public Vehicle() {
        speed = 0;
        size = 0;
    }

    public Vehicle(double speed, double size) {
        this.speed = speed;
        this.size = size;
    }

    public void move() {
        System.out.println("动弹一下");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void speedUp() {
        speed++;
    }

    public void speedDown() {
        speed--;
    }
}
