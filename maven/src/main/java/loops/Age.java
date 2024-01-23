import java.util.Scanner;
public class Age {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter your age:");
            int a = sc.nextInt();
            if (a >= 13 && a <= 19) {
                System.out.println("Teen");
            } else if (a < 13) {
                System.out.println("Kid");
            } else {
                System.out.println("Adult");
            }
        }
        sc.close();
    }
}