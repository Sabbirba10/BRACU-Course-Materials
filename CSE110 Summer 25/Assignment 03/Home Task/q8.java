import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int digits = 0;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int div = 1;
        for (int i = 1; i < digits; i++) {
            div *= 10;
        }

        while (div > 0) {
            int digit = n / div;
            System.out.print(digit);
            n = n % div;
            div /= 10;
            if (div > 0) {
                System.out.print(", ");
            }
        }
        sc.close();
        System.out.println();
    }
}
