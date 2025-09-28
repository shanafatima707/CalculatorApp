import java.util.Scanner;

/**
 * CalculatorApp - Modular, Scalable Java Calculator
 * Author: Shana Fatima
 * Date: 28-09-2025
 */
public class Calculator {

    // Modular methods
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b;
    }
    public static double modulus(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot modulus by zero!");
        return a % b;
    }
    public static double power(double a, double b) { return Math.pow(a, b); }
    public static double sqrt(double a) {
        if (a < 0) throw new ArithmeticException("Cannot calculate square root of negative number!");
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0;

        // Input validation for first number
        System.out.print("Enter first number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number:");
            sc.next(); // discard invalid input
        }
        num1 = sc.nextDouble();

        // Input validation for second number
        System.out.print("Enter second number: ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Enter a number:");
            sc.next(); // discard invalid input
        }
        num2 = sc.nextDouble();

        int choice;
        do {
            // Menu-driven interface
            System.out.println("\nChoose Operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Power");
            System.out.println("7. Square Root (of first number)");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number from 0-7:");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1: System.out.printf("Addition: %.2f\n", add(num1, num2)); break;
                case 2: System.out.printf("Subtraction: %.2f\n", subtract(num1, num2)); break;
                case 3: System.out.printf("Multiplication: %.2f\n", multiply(num1, num2)); break;
                case 4:
                    try { System.out.printf("Division: %.2f\n", divide(num1, num2)); }
                    catch (ArithmeticException e) { System.out.println("Division Error: " + e.getMessage()); }
                    break;
                case 5:
                    try { System.out.printf("Modulus: %.2f\n", modulus(num1, num2)); }
                    catch (ArithmeticException e) { System.out.println("Modulus Error: " + e.getMessage()); }
                    break;
                case 6: System.out.printf("Power: %.2f\n", power(num1, num2)); break;
                case 7:
                    try { System.out.printf("Square Root: %.2f\n", sqrt(num1)); }
                    catch (ArithmeticException e) { System.out.println("Square Root Error: " + e.getMessage()); }
                    break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice! Enter a number from 0-7."); break;
            }
        } while (choice != 0);

        sc.close();
        System.out.println("Calculator session ended.");
    }
}
