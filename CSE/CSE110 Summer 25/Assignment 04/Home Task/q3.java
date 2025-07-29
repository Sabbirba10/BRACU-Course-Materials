import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int isPrime = 1;
            if (num < 2) {
                isPrime = 0;
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        isPrime = 0;
                        break;
                    }
                }
            }
            if (isPrime == 1) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}
