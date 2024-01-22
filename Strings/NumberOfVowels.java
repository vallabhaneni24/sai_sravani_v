import java.util.Scanner;

public class NumberOfVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String");
        String inputString = scanner.nextLine();

        int numberOfVowels = numberofvowels(inputString);
        System.out.println("Number of vowels in the string: " + numberOfVowels);


        scanner.close();

    }
    private static int numberofvowels(String str) {

        str = str.toLowerCase();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }

}