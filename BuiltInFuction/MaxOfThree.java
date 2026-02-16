package String.BuiltInFuction;

import java.util.Scanner;

public class MaxOfThree {

    // Function to take integer input
    public static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Function to find maximum of three numbers
    public static int findMaximum(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // Function to display result
    public static void displayResult(int max) {
        System.out.println("The maximum number is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = getInput(sc, "Enter first number: ");
        int num2 = getInput(sc, "Enter second number: ");
        int num3 = getInput(sc, "Enter third number: ");

        int max = findMaximum(num1, num2, num3);

        displayResult(max);

        sc.close();
    }
}
