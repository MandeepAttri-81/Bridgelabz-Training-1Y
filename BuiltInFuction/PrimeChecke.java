package String.BuiltInFuction;

import java.util.Scanner;

public class PrimeChecke {

    // Function to take input
    public static int getNumber(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to display result
    public static void displayResult(int num, boolean result) {
        if (result) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = getNumber(sc);
        boolean primeStatus = isPrime(number);
        displayResult(number, primeStatus);

        sc.close();
    }
}
