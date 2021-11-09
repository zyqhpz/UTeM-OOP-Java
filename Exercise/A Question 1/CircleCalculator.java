public class CircleCalculator {
    private int radius;

    public CircleCalculator(int radius) {
        this.radius = radius;
    }

    public double calcDiameterOfCircle() {
        return 2 * radius;
    }

    public double calcAreaOfCircle() {
        return Math.PI * radius * radius;
    }

    public double calcCircumferenceOfCircle() {
        return 2 * Math.PI * radius;
    }

    public double calcAreaOfSector(int angle) {
        return Math.PI * radius * radius * angle / 360;
    }

}
