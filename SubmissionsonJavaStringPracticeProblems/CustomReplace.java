package String.SubmissionsonJavaStringPracticeProblems;

import java.util.Scanner;

public class CustomReplace {

    // Custom replace method
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();

        // Replacement word
        System.out.print("Enter new word: ");
        String newWord = scanner.next();

        // Call method
        String result = replaceWord(sentence, oldWord, newWord);

        // Output result
        System.out.println("Modified Sentence: " + result);

        scanner.close();
    }
}
