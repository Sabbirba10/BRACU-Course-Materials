import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // input

        if (num % 7 == 0 && num % 5 == 0) { // divisible by both 5 and 7
            System.out.println("Divisible by Both");
        } else if (num % 5 == 0) { // divisible by 5 only
            System.out.println("Invalid: Divisible by 5 only");
        } else if (num % 7 == 0) { // divisible by 7 only
            System.out.println("Invalid: Divisible by 7 only");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
