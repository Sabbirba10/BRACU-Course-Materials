import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 float number: ");
        float num1 = sc.nextFloat(); // 1st number

        System.out.print("Enter 2nd float number: "); // 2nd number
        float num2 = sc.nextFloat();

        System.out.print("Enter 3rd float number: "); // 3rd number
        float num3 = sc.nextFloat();

        if (num1 > num2 && num1 > num3) { // num1 is the maximum
            System.out.println("Maximum number is: " + num1);

        } else if (num2 > num1 && num2 > num3) { // num2 is the maximum
            System.out.println("Maximum number is: " + num2);

        } else { // num3 is the maximum
            System.out.println("Maximum number is: " + num3);
        }

        if (num1 < num2 && num1 < num3) { // num1 is the minimum
            System.out.println("Minimum number is: " + num1);

        } else if (num2 < num1 && num2 < num3) { // num2 is the minimum
            System.out.println("Minimum number is: " + num2);
        } else { // num3 is the minimum
            System.out.println("Minimum number is: " + num3);
        }
        sc.close();
    }
}
