import java.util.Scanner;

public class labquiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TOTAL_THEORY = 24;
        int TOTAL_LAB = 10;
        int studentNum = 1;

        while (true) {
            System.out.print("Enter student " + studentNum + "'s name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of theory classes attended by " + name + ": ");
            int theory = sc.nextInt();

            System.out.print("Enter number of lab classes attended by " + name + ": ");
            int lab = sc.nextInt();
            sc.nextLine(); // consume newline

            if (theory == 0 || lab == 0) {
                break;
            }

            boolean eligible = (theory >= 0.7 * TOTAL_THEORY) && (lab >= 0.9 * TOTAL_LAB);

            if (eligible) {
                System.out.println(name + " is eligible for the Final Exam.");
            } else {
                System.out.println(name + " is not eligible for the Final Exam.");
            }
            studentNum++;
        }
    }
}
