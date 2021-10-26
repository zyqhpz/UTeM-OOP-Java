public class MyMain {

    static Rectangle r1 = new Rectangle(4, 40); // Rectangle je error
    static Rectangle r2 = new Rectangle(3.5, 35.9);

    public static void main(String[] args) {
        System.out.println("\nRectangle 1: \nArea: " + r1.getArea() + "\nPerimeter: " + r1.getPerimeter());
        System.out.println("\nRectangle 2: \nArea: " + r2.getArea() + "\nPerimeter: " + r2.getPerimeter());
    }
}
