public class c1a {
    public static void main(String[] args) {
        for (int num = 24; num >= -6; num -= 6) {
            System.out.print(num);
            if (num > -6) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
