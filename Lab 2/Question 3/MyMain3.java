public class MyMain3 {
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out
                .print("\nRegular Polygon 1:\nPerimeter: " + polygon1.getPerimeter() + "\nArea: " + polygon1.getArea());
        System.out.print(
                "\n\nRegular Polygon 2:\nPerimeter: " + polygon2.getPerimeter() + "\nArea: " + polygon2.getArea());
        System.out.print(
                "\n\nRegular Polygon 3:\nPerimeter: " + polygon3.getPerimeter() + "\nArea: " + polygon3.getArea());
    }
}
