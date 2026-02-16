package String.BuiltInFuction;

import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate next guess
    public static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    // Method to get user feedback
    public static String getFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    // Method to update range based on feedback
    public static int[] updateRange(String feedback, int guess, int low, int high) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");

        while (!feedback.equals("correct")) {
            int guess = generateGuess(low, high);
            feedback = getFeedback(sc, guess);

            if (!feedback.equals("correct")) {
                int[] range = updateRange(feedback, guess, low, high);
                low = range[0];
                high = range[1];
            }
        }

        System.out.println("Yay! I guessed your number!");
        sc.close();
    }
}
