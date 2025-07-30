import java.util.Scanner;

public class c6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int y = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                y -= i * i;
            } else {
                y += i * i;
            }
        }
        System.out.println("The result is: " + y);
        sc.close();
    }
}
