import java.util.Scanner;

public class c3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0 && num % 7 == 0) {
            System.out.println("Divisible by Both");
        } else if (num % 5 == 0) {
            System.out.println("Invalid: Divisible by 5 only");
        } else if (num % 7 == 0) {
            System.out.println("Invalid: Divisivle by 7 only");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
