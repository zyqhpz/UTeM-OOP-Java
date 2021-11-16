public class MainCalculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide input!");
        } else {
            double value = Double.parseDouble(args[0].trim());
            System.out.println("The input value is: " + value + " km.");

            ConversionCalculator calculator = new ConversionCalculator(value);
            System.out.println("\n***Convert To Meter and Centimeter");
            System.out.println("Meter\t\t: " + calculator.convertToMeter() + " m.");
            System.out.println("Centimeter\t: " + calculator.convertToCentimeter() + " cm.");

            System.out.println("\n***Convert Length from Metric to Chinese***");
            ChineseLengthCalculator chineseLengthCalculator = new ChineseLengthCalculator(value);
            System.out.println("Meter\t\t: " + chineseLengthCalculator.convertToMeter() + " m.");
            System.out.println("Li\t\t: " + chineseLengthCalculator.convertToLi());
            System.out.println("Chi\t\t: " + chineseLengthCalculator.convertToChi());

            System.out.println("\n***Convert Length from Metric to English***");
            EnglishLengthCalculator englishLengthCalculator = new EnglishLengthCalculator(value);
            System.out.println("Mile\t\t: " + englishLengthCalculator.convertToMile());
            System.out.println("Feet\t\t: " + englishLengthCalculator.convertToFeet());

            System.out.println("\n***Calculate Fuel Consumption from KM***");
            KilometerToFuelLiter kilometerToFuelLiter = new KilometerToFuelLiter(value);
            System.out.println("Fuel Liter\t: " + kilometerToFuelLiter.calculateLiter());

            System.out.println("\n***Mile to Gallon***");
            MileToFuelGallon mileToFuelGallon = new MileToFuelGallon(value);
            System.out.println("Fuel Gallon\t: " + mileToFuelGallon.calculateLiterGallon());

        }
    }
}
