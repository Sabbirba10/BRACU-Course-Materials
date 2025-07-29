import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Customer: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Item Number for Customer-" + i + ": ");
            int k = sc.nextInt();
            double sum = 0;
            for (int item = 1; item <= k; item++) {
                System.out.print("Item-" + item + ": ");
                double price = sc.nextDouble();
                sum += price;
            }
            double avg = sum / k;
            System.out.println("Average price for Customer-" + i + ": " + avg);
        }
        sc.close();
    }
}
