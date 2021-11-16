package example;

public class JapanCar extends Car {
    private String name;

    public JapanCar() {
        super();
    }

    // public JapanCar(String name, int speed, int direction) {
    // super(name, speed, direction);
    // this.name = name;
    // }

    public JapanCar(String name, int speed, int direction) {
        super(speed, direction);
        super.setName(name);
        this.name = name;
    }

    // public JapanCar(String name) {
    // this.name = name;
    // }
}
