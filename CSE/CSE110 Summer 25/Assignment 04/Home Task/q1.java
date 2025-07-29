import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int sum = 0;
            int count = 0;
            int num = X;
            while (count < Y) {
                if (num % 2 != 0) {
                    sum += num;
                    count++;
                }
                num++;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}