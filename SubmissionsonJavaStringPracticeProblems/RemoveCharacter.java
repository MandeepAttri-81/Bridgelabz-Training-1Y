package String.SubmissionsonJavaStringPracticeProblems;
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input character to remove
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);

        String result = "";

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ch) {
                result += input.charAt(i);
            }
        }

        // Output result
        System.out.println("Modified String: \"" + result + "\"");

        scanner.close();
    }
}
