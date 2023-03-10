package zy3;

public class Vehicle {

    /*3.定义一个交通工具类（Vehicle）的类，其中有：

    属性： 速度（speed） ，体积（size）等等

    方法： 移动（move()）, 设置速度（setSpeed(int speed)）, 加速（speedUp()）, 减速（speedDown()）等等

    最后在测试类Test的main()里面实例化一个交通工具的对象，并通过构造方法给它初始化speed，size的值，

    并且打印出来，另外通过加速，减速的方法对其速度进行改变*/

    int speed;
    int size;

    public Vehicle(){}

    public Vehicle(int speed,int size){
        this.speed=speed;
        this.size=size;
    }

    public void move(){
        System.out.println("车辆移动了。。。");
    }

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void speedUp(){
        this.speed+=20;
    }

    public void speedDown(){
        this.speed-=10;
    }

    public void show(){
        System.out.println("当前速度是： "+speed);
    }

}
