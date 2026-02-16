package String.BuiltInFuction;
import java.util.Scanner;

public class RecursiveFactorial {

    // Function to take input
    public static int getNumber(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Recursive function to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {   // base case
            return 1;
        }
        return n * factorial(n - 1);  // recursive call
    }

    // Function to display result
    public static void displayResult(int num, long result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = getNumber(sc);

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = factorial(number);
            displayResult(number, result);
        }

        sc.close();
    }
}
