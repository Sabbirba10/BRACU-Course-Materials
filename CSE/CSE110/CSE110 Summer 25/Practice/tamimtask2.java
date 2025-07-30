import java.util.Scanner;

public class tamimtask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Tax Calculation Tool");

        System.out.print("Enter the age: ");

        int age = input.nextInt();

        System.out.print("Enter your payment: ");

        double payment = input.nextDouble();

        double tax = 0;
        if (age < 18) {
            tax = 0;
        } else if (payment < 10000) {
            tax = 0;
        } else if (payment < 20000) {
            tax = payment * 0.05;
        } else {
            tax = payment * 0.10;
        }

        System.out.printf("Calculated tax amount: %.2f", tax);
        input.close();
    }
}