import java.util.Scanner;
/**
     * CalculatorApp - Modular , Scalable Java calculator
     * Author: Shana Fatima
     * Date: 28-09-2025
     */
public class Calculator {
    
    //Modular methods
public static double add(double a, double b) {return a + b;}
public static double substarct(double a, double b) {return a - b;}
public static double mutliply(double a, double b) {return a * b;}
public static double divide(double a, double b) {
    if( b == 0) throw new ArithmeticException("Cannot divide by zero!");
    return a / b;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first number: ");
    double num1 = sc.nextDouble();

    System.out.println("Enter second number: ");
    double num2 =sc.nextDouble();

    System.out.println("Addition: "+ add(num1 , num2));
    System.out.println("Substract: "+substarct(num1, num2));
    System.out.println("Multiplication: "+mutliply(num1, num2));

    try {
        System.err.println("Division: "+ divide(num1, num2));
    } catch (ArithmeticException e) {
        // TODO: handle exception
        System.out.println("Error: "+ e.getMessage());
    }
    sc.close();

}


}
