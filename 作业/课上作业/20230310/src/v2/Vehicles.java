package v2;

public class Vehicles {
    String brand;
    String color;

    public Vehicles(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void run(){
        System.out.println("我已经开动了");
    }

    public void showInfo(){
        System.out.println("品牌："+brand+" 颜色："+color);
    }

}
