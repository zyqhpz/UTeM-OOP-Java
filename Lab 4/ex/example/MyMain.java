package example;

public class MyMain {
    public static void main(String[] args) {
        JapanCar toyota = new JapanCar();
        JapanCar honda = new JapanCar("Crab", 175, 2);

        toyota.setSpeed(150);
        toyota.setName("Vios");
        toyota.setDirection(1);

        toyota.printState();
        honda.printState();
    }
}
