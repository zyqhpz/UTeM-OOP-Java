package example;

public class Car {
    private String name;
    private int speed;
    private int direction;

    public Car(String name) {
        this.name = name;
    }

    public Car(int speed, int direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public Car(String name, int speed, int direction) {
        this.name = name;
        this.speed = speed;
        this.direction = direction;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void printState() {
        System.out.println("Car " + name + " is going " + speed + " km/h in direction " + direction);
    }
}