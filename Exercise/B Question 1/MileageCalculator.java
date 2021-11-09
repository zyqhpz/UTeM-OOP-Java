public class MileageCalculator {

    private double typeEngine;
    private double distance;

    public MileageCalculator(double typeEngine, double distance) {
        this.typeEngine = typeEngine;
        this.distance = distance;
    }

    public double calcMileageBelow1500cc() {
        if (distance <= 500) {
            return calcClaim(0.60);
        } else {
            return calcClaim(0.65);
        }
    }

    public double calcMileageAbove1500cc() {
        if (distance <= 500) {
            return calcClaim(0.80);
        } else {
            return calcClaim(0.85);
        }
    }

    public double calcClaim(double rate) {
        return rate * distance;
    }
}
