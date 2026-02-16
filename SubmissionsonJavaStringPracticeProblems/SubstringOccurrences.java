package String.SubmissionsonJavaStringPracticeProblems;
import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input main string
        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();

        // Input substring
        System.out.print("Enter the substring to search: ");
        String sub = scanner.nextLine();

        int count = 0;
        int index = 0;

        // Loop to find occurrences
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move past current match
        }

        // Output result
        System.out.println("Occurrences: " + count);

        scanner.close();
    }
}
