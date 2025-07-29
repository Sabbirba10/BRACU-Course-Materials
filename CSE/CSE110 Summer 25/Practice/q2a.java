import java.util.Scanner;

public class q2a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
            sum += i;
        }
        System.out.println();
        System.out.println("The sum of " + n + " numbers is " + sum);
        double avg = sum / n;
        System.out.println("The avg of " + n + " numbers is " + avg);
        sc.close();
    }

    }

    

    