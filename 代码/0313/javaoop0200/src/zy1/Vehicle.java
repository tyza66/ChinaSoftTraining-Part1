package zy1;

public class Vehicle {

/*    已有一个交通工具类vehicle，

    属性包括：

    速度speed 类别kind 颜色color。

    方法包括:

    设置速度，设置颜色，取得类别，取得颜色。

    设计一个小车类car。继承自vehicle。

    car中增加属性：座位数passenger，增加了设置和获取座位数的方法，创建car的对象，为其设置新速度和颜		色，并显示状态（所有属性。*/

    int speed;
    String kind;
    String color;

    public void setSpeed(int speed){
        this.speed=speed;
    }

    public void serColor(String color){
        this.color=color;
    }

    public String getKind(){
        return kind;
    }

    public String getColor(){
        return color;
    }



}


