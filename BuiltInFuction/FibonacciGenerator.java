package String.BuiltInFuction;

import java.util.Scanner;

public class FibonacciGenerator {

    // Function to get number of terms
    public static int getTerms(Scanner sc) {
        System.out.print("Enter number of terms: ");
        return sc.nextInt();
    }

    // Function to generate and print Fibonacci sequence
    public static void printFibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Sequence:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int terms = getTerms(sc);
        printFibonacci(terms);

        sc.close();
    }
}
