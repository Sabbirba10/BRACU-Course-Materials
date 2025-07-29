package Lec13_13Apr;

public class OrderTester {
    public static void main(String[] args) {
        Order o1 = new Order("Burger");
        System.out.println(o1.orderNo+" " + o1.item);
        Order o2 = new Order("Pizza");
        System.out.println(o2.orderNo+" " + o2.item);
        Order o3 = new Order("Pasta");
        System.out.println(o3.orderNo+" " + o3.item);
        System.out.println("---- ----");
        System.out.println(o1.orderNo+" " + o1.item);

    }
}
