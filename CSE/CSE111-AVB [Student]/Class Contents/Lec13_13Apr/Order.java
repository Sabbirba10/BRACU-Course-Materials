package Lec13_13Apr;

public class Order {
    public static int orderCount;
    public int orderNo;
    public String item;
    public Order(String item) {
        this.item = item;
        this.orderCount++;
        this.orderNo = orderCount;
    }
}
