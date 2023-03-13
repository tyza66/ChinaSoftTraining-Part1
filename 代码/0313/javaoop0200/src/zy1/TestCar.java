package zy1;

public class TestCar {
    public static void main(String[] args) {

        Car car=new Car();
        //2种方式给属性赋值 1. 调用属性  2. 通过setXXX的方法
        car.setSpeed(100);
        car.serColor("红色");
        car.kind="SUV";
        car.setPassenger(5);

        //取值 1. 调用属性 2.getXXX方法来实现
        System.out.println("类别： "+car.getKind()+" 颜色："+car.getColor()+" 速度："+car.speed+" 座位数："+car.getPassenger());
    }
}
