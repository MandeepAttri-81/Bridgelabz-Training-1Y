package String.BuiltInFuction;

import java.util.Scanner;

public class BasicCalculator {

    // Function to choose operation
    public static int getChoice(Scanner sc) {
        System.out.println("\nCalculator Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choose operation (1-4): ");
        return sc.nextInt();
    }

    // Function to get number input
    public static double getNumber(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextDouble();
    }

    // Arithmetic functions
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    // Function to display result
    public static void displayResult(double result) {
        if (!Double.isNaN(result)) {
            System.out.println("Result = " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = getChoice(sc);

        double num1 = getNumber(sc, "Enter first number: ");
        double num2 = getNumber(sc, "Enter second number: ");

        double result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        displayResult(result);
        sc.close();
    }
}

