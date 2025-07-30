public class q4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        double h = a / 2; // side length of the hexagon
        double c = Math.sqrt((h * h) + (b * b)); // calculating the height of the hexagon

        double area = (((3 * Math.sqrt(3)) / 2) * (c * c)); // calculating the area
        double circumference = 6 * c; // calculating the circumference

        System.out.println("Area of the hexagon is " + area + " and circumference is " + circumference);
    }
}