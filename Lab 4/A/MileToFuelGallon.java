public class MileToFuelGallon extends EnglishLengthCalculator {

    MileToFuelGallon(double value) {
        super(value);
    }

    public double calculateLiterGallon() {
        return value * 0.62 * 4.55;
    }
}
