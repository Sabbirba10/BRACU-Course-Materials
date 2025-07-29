public class c1b {
    public static void main(String[] args) {
        int num = 18;
        int s = 1;
        for (int i = 0; i < 6; i++) {
            System.out.print(num * s);
            if (i < 5) {
                System.out.print(", ");
            }
            num += 9;
            s *= -1;
        }
        System.out.println();
    }
}
