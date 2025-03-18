import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get sentence from user
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words."); // Display result
    }

    // Method to get a sentence from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim(); // Read input and trim spaces
        return sentence;
    }

    // Method to count words in a sentence
    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0; // Return 0 if the sentence is empty
        }
        String[] words = sentence.split("\\s+"); // Split by spaces (handling multiple spaces)
        return words.length;
    }
}
