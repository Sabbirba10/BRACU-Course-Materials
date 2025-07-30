import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int s = sc.nextInt();

        if (s >= 90 && s <= 100) {
            System.out.println("Your grade is A");
        } else if (s >= 85 && s <= 89) {
            System.out.println("Your grade is A-");
        } else if (s >= 70 && s <= 84) {
            System.out.println("Your grade is B");
        } else if (s >= 69 && s <= 57) {
            System.out.println("Your grade is C");
        } else if (s >= 50 && s <= 56) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
        sc.close();
    }
}