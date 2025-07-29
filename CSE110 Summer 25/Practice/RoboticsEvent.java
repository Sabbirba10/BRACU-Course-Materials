import java.util.Scanner;

public class RoboticsEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three scores
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double total = s1 + s2 + s3;
        double percentage = (total / 300) * 100;

        if (percentage < 70) {
            System.out.println("No performance");
        } else {
            double max, mid, min;
            // Find max, mid, min using branching
            if (s1 >= s2 && s1 >= s3) {
                max = s1;
                if (s2 >= s3) {
                    mid = s2;
                    min = s3;
                } else {
                    mid = s3;
                    min = s2;
                }
            } else if (s2 >= s1 && s2 >= s3) {
                max = s2;
                if (s1 >= s3) {
                    mid = s1;
                    min = s3;
                } else {
                    mid = s3;
                    min = s1;
                }
            } else {
                max = s3;
                if (s1 >= s2) {
                    mid = s1;
                    min = s2;
                } else {
                    mid = s2;
                    min = s1;
                }
            }

            double sum = max * 0.5 + mid * 0.3 + min * 0.2;
            double avg = sum / 3;

            System.out.println("Average score: " + avg);

            if (sum >= 70 && sum <= 80) {
                System.out.println("Sum is between 70% and 80%");
            }
        }
        sc.close();
    }
}