package v1;

public class Car extends Vehicle {
    int passenger;

    public Car(double speed, String kind, String color, int passenger) {
        super(speed, kind, color);
        this.passenger = passenger;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }
}
