import java.util.Scanner;

public class CheckRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        boolean isRotation = isRotation(str1, str2);
        if (isRotation) {
            System.out.println("The second string is a rotation of the first string.");
        } else {
            System.out.println("The second string is not a rotation of the first string.");
        }

        scanner.close();
    }


    private static boolean isRotation(String str1, String str2) {

        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        String concatenated = str1 + str1;

        return concatenated.contains(str2);
    }
}