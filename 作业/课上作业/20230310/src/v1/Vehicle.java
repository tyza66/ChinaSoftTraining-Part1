package v1;

public class Vehicle {
    double speed;
    String kind;
    String color;

    public Vehicle(double speed, String kind, String color) {
        this.speed = speed;
        this.kind = kind;
        this.color = color;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getKind(){
        return kind;
    }

    public String getColor(){
        return color;
    }
}
