package String.SubmissionsonJavaStringPracticeProblems;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        // Loop through each character
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch); // keep special characters unchanged
            }
        }

        // Output result
        System.out.println("Toggled string: " + result.toString());

        scanner.close();
    }
}
