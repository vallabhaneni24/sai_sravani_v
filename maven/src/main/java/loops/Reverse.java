import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int a= sc.nextInt();
        int b=0;
        while(a!=0) {
            int digit = a % 10;
            b = b * 10 + digit;
            a = a / 10;
        }
        System.out.println(b);
        sc.close();

    }
}
