package additional;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is always 1
        } else {
            return n * factorial(n - 1); // Recursively calculate factorial
        }
    }
}