import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n = n / 10;
            if (n > 0) {
                System.out.print(", ");
            }
        }
        sc.close();
        System.out.println(); // to get into a new line
    }
}
