import java.util.Scanner;

public class sqlab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        int count = 0;
        int diff;
        if (end - start >= 0) {
            diff = end - start;
        } else {
            diff = start - end;
        }

        // Print composite numbers directly
        for (int i = start; i <= end; i++) {
            int composite = 0;
            if (i > 3) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        composite = 1;
                        break;
                    }
                }
            }
            if (composite == 1) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Too far off.");
        } else {
            if (diff % count == 0) {
                System.out.println("Congratulations! The treasure is yours.");
            } else {
                System.out.println("Close! But not quite.");
            }
        }
        sc.close();
    }
}
