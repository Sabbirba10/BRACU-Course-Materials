import java.util.Scanner;

public class c7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            int count = 0;
            if (num == 0) {
                count = 1;
            } else {
                if (num < 0)
                    num = -num;
                for (; num > 0; num /= 10) {
                    count++;
                }
            }
            System.out.println("Total digits = " + count);
            sc.close();
        }
    }
}
