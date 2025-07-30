import java.util.Scanner;

public class LabQuiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attendance = sc.nextInt();
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();

        // Check attendance & any score < 50
        if (attendance < 70) {
            System.out.println("Disqualified due to low attendance");
        } else if (score1 < 50 || score2 < 50 || score3 < 50) {
            System.out.println("Needs Improvement in Event(s)");
        } else {
            // Find highest, second highest and lowest
            int highest, lowest, second;
            if (score1 >= score2 && score1 >= score3) {
                highest = score1;
                if (score2 >= score3) {
                    second = score2;
                    lowest = score3;
                } else {
                    second = score3;
                    lowest = score2;
                }
            } else if (score2 >= score1 && score2 >= score3) {
                highest = score2;
                if (score1 >= score3) {
                    second = score1;
                    lowest = score3;
                } else {
                    second = score3;
                    lowest = score1;
                }
            } else {
                highest = score3;
                if (score1 >= score2) {
                    second = score1;
                    lowest = score2;
                } else {
                    second = score2;
                    lowest = score1;
                }
            }
            // Calculate weighted total
            double total = 0.5 * highest + 0.3 * second + 0.2 * lowest;
            // Decide category
            if (total >= 85) {
                System.out.println("Selected for Advanced Category");
            } else if (total >= 70) {
                System.out.println("Selected for Intermediate Category");
            } else {
                System.out.println("Selected for Beginner Category");
            }
        }
    }
}