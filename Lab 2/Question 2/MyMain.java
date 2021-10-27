public class MyMain {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("\n--Rectangle 1--\nWidth: " + rect1.getWidth() + "\nHeight: " + rect1.getHeight()
                + "\nArea: " + rect1.getArea() + "\nPerimeter: " + rect1.getPerimeter());

        System.out.println("\n--Rectangle 2--\nWidth: " + rect2.getWidth() + "\nHeight: " + rect2.getHeight()
                + "\nArea: " + rect2.getArea() + "\nPerimeter: " + rect2.getPerimeter());

        // rect1.display();
        // Rectangle.printMessage();
    }
}
