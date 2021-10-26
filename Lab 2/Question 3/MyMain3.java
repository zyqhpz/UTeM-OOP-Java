public class MyMain3 {

    static RegularPolygon rp1 = new RegularPolygon();
    static RegularPolygon rp2 = new RegularPolygon(6, 4);
    static RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

    public static void main(String[] args) {
        System.out.print("\nRegularPolygon rp1:\nPerimeter: " + rp1.getPerimeter() + "\nArea: " + rp1.getArea());
        System.out.print("\n\nRegularPolygon rp2:\nPerimeter: " + rp2.getPerimeter() + "\nArea: " + rp2.getArea());
        System.out.print("\n\nRegularPolygon rp3:\nPerimeter: " + rp3.getPerimeter() + "\nArea: " + rp3.getArea());
    }
}
