import java.util.Scanner;

public class c5p {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int x = sc.nextInt();
        int r = 0;

        if (x < 0) {
            r = 2 * x;
        } else if (x < 2) {
            r = x + 1;
        } else if (x < 5) {
            r = x * x - 1;
        } else {
            r = 3 * x * x + 2;
        }
        System.out.println("output: " + r);
        sc.close();
    }
}
