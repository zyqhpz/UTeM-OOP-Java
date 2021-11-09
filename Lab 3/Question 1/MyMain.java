import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float b = scanner.nextFloat();
        System.out.println("Maximum number is " + Math.max(a, b));
        scanner.close();
    }
}