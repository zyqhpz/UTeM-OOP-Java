public class MyMainMileageClaim {
    public static void main(String[] args) {
        MileageCalculator mileAge1 = new MileageCalculator(1000, 500);
        MileageCalculator mileAge2 = new MileageCalculator(1600, 700);

        System.out.println("Total claim is RM " + mileAge1.calcMileageBelow1500cc());
        System.out.println("Total claim is RM " + mileAge2.calcMileageAbove1500cc());
    }
}
