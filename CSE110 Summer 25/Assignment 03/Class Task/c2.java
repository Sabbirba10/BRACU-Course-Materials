import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        System.out.print("Input the " + n + " numbers:");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double avg = (double) sum / n;
        System.out.println("The sum of " + n + " no is: " + sum);
        System.out.println("The Average is: " + avg);
        sc.close();
    }
}
