package strings;

import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();


        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }
}