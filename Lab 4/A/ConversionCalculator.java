public class ConversionCalculator {
    protected double value;

    public ConversionCalculator(double value) {
        this.value = value;
    }

    public double convertToMeter() {
        return value * 1000;
    }

    public double convertToCentimeter() {
        return value * Math.pow(10, 5);
    }

    public double convertToLi() {
        return value * 2;
    }

    public double convertToChi() {
        return value * Math.pow(10, -3) * 3;
    }
}