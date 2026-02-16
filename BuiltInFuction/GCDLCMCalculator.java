package String.BuiltInFuction;
import java.util.Scanner;

public class GCDLCMCalculator {

    // Function to take input
    public static int getNumber(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to calculate GCD (Euclidean Algorithm)
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    // Function to display results
    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getNumber(sc, "Enter first number: ");
        int num2 = getNumber(sc, "Enter second number: ");

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        displayResult(num1, num2, gcd, lcm);

        sc.close();
    }
}
