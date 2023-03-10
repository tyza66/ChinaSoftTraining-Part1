package v2;

public class Truck extends Vehicles {
    float load;

    public Truck(String brand, String color, float load) {
        super(brand, color);
        this.load = load;
    }

    public void showTruck(){
        System.out.println("这辆卡车的载重是："+load+" 品牌："+brand+" 颜色："+color);
    }
}
