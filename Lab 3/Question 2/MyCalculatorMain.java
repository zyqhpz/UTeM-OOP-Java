import java.util.ArrayList;

public class MyCalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // make arraylist of float
        ArrayList<Float> values = new ArrayList<Float>();
        // add values to arraylist
        values.add(2.33f);
        values.add(4.55f);
        values.add(5.66f);
        values.add(7.88f);

        System.out.println("Max value is " + calculator.getMax(values));
        System.out.println("Min value is " + calculator.getMin(values));
        System.out.println("Average value is " + calculator.getAverage(values));
        System.out.println("Sum value is " + calculator.getSum(values));
    }
}