import java.util.Scanner;

public class quiz1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your usage: ");
        int mb = sc.nextInt();

        System.out.print("Enter your usage: ");
        int use = sc.nextInt();

        if (mb >= 2000 && mb <= 8000) {
            {
                System.out.println("Validate");
            }
            if (use / 2 <= use) {
                System.out.println("Data is being used wisely.");
            } else if ((use > 1000)) {
                System.out.println("Less data remaining.");
            } else {
                System.out.println("Keep an eye on usage.");
            }
        } else {
            System.out.println("Invaid data plan.");
        }
        sc.close();
    }
}
