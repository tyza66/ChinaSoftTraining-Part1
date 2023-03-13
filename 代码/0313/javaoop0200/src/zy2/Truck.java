package zy2;

public class Truck extends Vehicles {

    float load;

    public Truck(){}

    public Truck(String brand,String color,float load){
        this.brand=brand;
        this.color=color;
        this.load=load;
    }

    public void showTruck(){
        System.out.println("商标： "+brand+" 颜色："+color+" 载重："+load);
    }
}
