import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int divisor = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && n > 2) {
                divisor++;
            }
        }
            if (divisor == 2) {
                System.out.println(n + " is a prime number.");
            }
            else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
