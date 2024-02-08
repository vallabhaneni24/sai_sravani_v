package lambdas;

public class Calculator {
    public static void main(String[] args) {
        // Lambda expression for addition
        MathOperation addition = (a, b) -> a + b;

        // Test addition operation
        int result = addition.operate(5, 3);
        System.out.println("Result of addition: " + result);
    }
}