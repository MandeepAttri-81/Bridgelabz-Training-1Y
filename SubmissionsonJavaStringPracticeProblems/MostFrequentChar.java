package String.SubmissionsonJavaStringPracticeProblems;

import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int[] freq = new int[256]; // ASCII frequency array

        // Count frequency of each character
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        // Find character with highest frequency
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                mostFrequent = (char) i;
            }
        }

        // Output result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        scanner.close();
    }
}
