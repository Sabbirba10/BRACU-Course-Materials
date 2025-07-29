import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The odd numbers are:");
        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.println(i);
            sum += i;
        }
        sc.close();
        System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
    }
}
