public class EnglishLengthCalculator extends ConversionCalculator {

    public EnglishLengthCalculator(double value) {
        super(value);
    }

    public double convertToMile() {
        return value * 0.62;
    }

    public double convertToFeet() {
        return value * 1000 * 3.281;
    }
}
