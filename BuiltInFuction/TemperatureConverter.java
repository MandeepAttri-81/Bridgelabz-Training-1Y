package String.BuiltInFuction;

import java.util.Scanner;

public class TemperatureConverter {

    // Function to choose conversion type
    public static int getChoice(Scanner sc) {
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        return sc.nextInt();
    }

    // Function to get temperature input
    public static double getTemperature(Scanner sc) {
        System.out.print("Enter temperature value: ");
        return sc.nextDouble();
    }

    // Celsius → Fahrenheit
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Fahrenheit → Celsius
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Display result
    public static void displayResult(double result, String unit) {
        System.out.println("Converted Temperature: " + result + " " + unit);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = getChoice(sc);
        double temp = getTemperature(sc);

        if (choice == 1) {
            double result = celsiusToFahrenheit(temp);
            displayResult(result, "°F");
        }
        else if (choice == 2) {
            double result = fahrenheitToCelsius(temp);
            displayResult(result, "°C");
        }
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
