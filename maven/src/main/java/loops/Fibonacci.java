import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int num = sc.nextInt();
        System.out.println("Fibonacci Series of " + num + " terms:");
        int a = 0;
        int b = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(a + " ");
            int n = a + b;
            a=b;
            b=n;
        }
        sc.close();
    }
}