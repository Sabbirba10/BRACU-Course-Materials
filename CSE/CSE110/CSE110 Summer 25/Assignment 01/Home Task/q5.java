public class q5 {
    public static void main(String[] args) {
        double a = 4.5;
        double b = 9.5;
        double c = Math.sqrt(a * a + b * b); // calculating the hypotenuse

        System.out.println("sin(A)= " + a / c);
        System.out.println("cos(A)= " + b / c);
        System.out.println("sin(B)= " + b / c);
        System.out.println("cos(B)= " + a / c);
    }
}
