package String.SubmissionsonJavaStringPracticeProblems;
import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split sentence into words
        String[] words = sentence.split("\\s+");

        String longestWord = "";

        // Find longest word
        for (String word : words) {
            // Remove punctuation
            word = word.replaceAll("[^a-zA-Z]", "");

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Output result
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }
}
