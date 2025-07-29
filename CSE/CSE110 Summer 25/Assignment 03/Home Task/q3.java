import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int non = 0, neg = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            if (num >= 0) {
                non++;
            } else {
                neg++;
            }
        }
        sc.close();
        System.out.println(non + " Non-neg Numbers");
        System.out.println(neg + " Neg Numbers");
    }
}
