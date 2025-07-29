import java.util.Scanner;

public class c5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                break;
            }
            System.out.println(num + " ^ 2 = " + (num * num));
        }
        sc.close();
    }
}