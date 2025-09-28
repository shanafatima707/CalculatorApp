import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static ArrayList<String> history = new ArrayList<>();

    // ========== Main Method ==========
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            printMenu();
            int choice = getChoice(scanner);

            switch (choice) {
                case 1 -> performAddition(scanner);
                case 2 -> performSubtraction(scanner);
                case 3 -> performMultiplication(scanner);
                case 4 -> performDivision(scanner);
                case 5 -> performModulus(scanner);
                case 6 -> performPower(scanner);
                case 7 -> performSquareRoot(scanner);
                case 8 -> performFactorial(scanner);
                case 9 -> performLogarithm(scanner);
                case 10 -> performAbsolute(scanner);
                case 11 -> viewHistory();
                case 0 -> {
                    System.out.println("Exiting Calculator. Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
        scanner.close();
    }

    // ========== Menu ==========
    private static void printMenu() {
        System.out.println("\n====== Calculator Menu ======");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Power");
        System.out.println("7. Square Root");
        System.out.println("8. Factorial");
        System.out.println("9. Logarithm (base 10)");
        System.out.println("10. Absolute Value");
        System.out.println("11. View Calculation History");
        System.out.println("0. Exit");
        System.out.print("Choose an option: ");
    }

    // ========== Input Handling ==========
    private static int getChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! Enter a number from the menu: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static double getNumber(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    // ========== Operations ==========
    private static void performAddition(Scanner scanner) {
        double a = getNumber(scanner, "Enter first number: ");
        double b = getNumber(scanner, "Enter second number: ");
        double result = a + b;
        System.out.printf("Result: %.2f%n", result);
        history.add(a + " + " + b + " = " + result);
    }

    private static void performSubtraction(Scanner scanner) {
        double a = getNumber(scanner, "Enter first number: ");
        double b = getNumber(scanner, "Enter second number: ");
        double result = a - b;
        System.out.printf("Result: %.2f%n", result);
        history.add(a + " - " + b + " = " + result);
    }

    private static void performMultiplication(Scanner scanner) {
        double a = getNumber(scanner, "Enter first number: ");
        double b = getNumber(scanner, "Enter second number: ");
        double result = a * b;
        System.out.printf("Result: %.2f%n", result);
        history.add(a + " * " + b + " = " + result);
    }

    private static void performDivision(Scanner scanner) {
        double a = getNumber(scanner, "Enter numerator: ");
        double b = getNumber(scanner, "Enter denominator: ");
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            history.add(a + " / " + b + " = Error (divide by zero)");
            return;
        }
        double result = a / b;
        System.out.printf("Result: %.2f%n", result);
        history.add(a + " / " + b + " = " + result);
    }

    private static void performModulus(Scanner scanner) {
        double a = getNumber(scanner, "Enter first number: ");
        double b = getNumber(scanner, "Enter second number: ");
        if (b == 0) {
            System.out.println("Error: Cannot modulus by zero!");
            history.add(a + " % " + b + " = Error (modulus by zero)");
            return;
        }
        double result = a % b;
        System.out.printf("Result: %.2f%n", result);
        history.add(a + " % " + b + " = " + result);
    }

    private static void performPower(Scanner scanner) {
        double base = getNumber(scanner, "Enter base: ");
        double exponent = getNumber(scanner, "Enter exponent: ");
        double result = Math.pow(base, exponent);
        System.out.printf("Result: %.2f%n", result);
        history.add(base + "^" + exponent + " = " + result);
    }

    private static void performSquareRoot(Scanner scanner) {
        double a = getNumber(scanner, "Enter a number: ");
        if (a < 0) {
            System.out.println("Error: Cannot calculate square root of negative number!");
            history.add("sqrt(" + a + ") = Error (negative number)");
            return;
        }
        double result = Math.sqrt(a);
        System.out.printf("Result: %.2f%n", result);
        history.add("sqrt(" + a + ") = " + result);
    }

    private static void performFactorial(Scanner scanner) {
        int n;
        do {
            n = (int) getNumber(scanner, "Enter a non-negative integer: ");
            if (n < 0) System.out.println("Error: Factorial not defined for negative numbers!");
        } while (n < 0);

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.printf("Result: %d%n", result);
        history.add(n + "! = " + result);
    }

    private static void performLogarithm(Scanner scanner) {
        double a = getNumber(scanner, "Enter a positive number: ");
        if (a <= 0) {
            System.out.println("Error: Logarithm undefined for zero or negative numbers!");
            history.add("log(" + a + ") = Error (undefined)");
            return;
        }
        double result = Math.log10(a);
        System.out.printf("Result: %.2f%n", result);
        history.add("log(" + a + ") = " + result);
    }

    private static void performAbsolute(Scanner scanner) {
        double a = getNumber(scanner, "Enter a number: ");
        double result = Math.abs(a);
        System.out.printf("Result: %.2f%n", result);
        history.add("|" + a + "| = " + result);
    }

    // ========== History ==========
    private static void viewHistory() {
        System.out.println("\n--- Calculation History ---");
        if (history.isEmpty()) {
            System.out.println("No calculations performed yet.");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
    }
}
