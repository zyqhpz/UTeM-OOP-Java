public class MainCalculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input!");
        } else {
            double value = Double.parseDouble(args[0].trim());
            System.out.println("The input value is: " + value + " km.");
            ConversionCalculator calculator = new ConversionCalculator(value);
            System.out.println("***Convert To Meter and Centimeter");
            System.out.println("Meter\t\t:" + calculator.convertToMeter() + " m.");
            System.out.println("Centimeter\t: " + calculator.convertToCentimeter() + " cm.");

            System.out.println("***Convert Length from Metric to Chinese***");
            ChineseLengthCalculator chineseLengthCalculator = new ChineseLengthCalculator(value);
            System.out.println("Meter\t\t:" + chineseLengthCalculator.convertToMeter() + " m.");
            System.out.println("Li\t\t:" + chineseLengthCalculator.convertToLi());
            System.out.println("Chi\t\t:" + chineseLengthCalculator.convertToChi());
        }
    }
}
