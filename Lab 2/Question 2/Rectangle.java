public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return Math.round((height * width) * 100.0) / 100.0;
    }

    public double getPerimeter() {
        return Math.round((2 * (height + width)) * 100.0) / 100.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void display() {
        System.out.println("I am a rectangle");
    }

    public static void printMessage() {
        System.out.println("I am a rectangle as STATIC");
    }
}
