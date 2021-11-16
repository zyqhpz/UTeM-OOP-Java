public class KilometerToFuelLiter extends ConversionCalculator {

    public KilometerToFuelLiter(double value) {
        super(value);
    }

    public double calculateLiter() {
        return value * 0.01;
    }
}
