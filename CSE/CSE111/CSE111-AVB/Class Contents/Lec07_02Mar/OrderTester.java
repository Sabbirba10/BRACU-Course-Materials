package Lec07_02Mar;

public class OrderTester {
    public static void main(String[] args) {
        Order obj = new Order();
        obj.purchase("USB Cable", 200);
        System.out.println("=================");
        
        obj.purchase(600, "Mouse");
        System.out.println("=================");

        obj.purchase("Monitor", "Keyboard", "Speaker", 25000);
        System.out.println("=================");

        System.out.println("Products: "+obj.products);
        System.out.println("Cost: "+obj.cost);
    }
}
