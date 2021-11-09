public class CircleMainApp {
    public static void main(String[] args) {
        CircleCalculator circle = new CircleCalculator(2);
        System.out.println("Diameter: \t" + circle.calcDiameterOfCircle());
        System.out.println("Area: \t" + circle.calcAreaOfCircle());
        System.out.println("Circumference: \t" + circle.calcCircumferenceOfCircle());
        System.out.println("Area of Sector: \t" + circle.calcAreaOfSector(30));
    }
}
