import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            if (num % 2 != 0) {
                break;
            }
            int divisorCount = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisorCount++;
                }
            }
            System.out.println(num + " has " + divisorCount + " divisors");
        }
        sc.close();
    }
}