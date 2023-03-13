package zy2;



public class Car extends Vehicles {

    int seats;

    public Car(){}

    public Car(String brand,String color,int seats){
        this.brand=brand;
        this.color= color;
        this.seats=seats;
    }

    public void showCar(){
        System.out.println("商标： "+brand+" 颜色："+color+" 座位数："+seats);
    }


}
