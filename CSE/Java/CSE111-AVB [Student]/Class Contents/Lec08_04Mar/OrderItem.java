package Lec08_04Mar;

public class OrderItem {
    public String itemName;
    public int quantity;
    public double unitPrice;
    public String address;
    public OrderItem() {
        System.out.println("this is orderItem() method");
    }
    public void makeOrder(String name, int qty, double price) {
        this.itemName = name;
        this.quantity = qty;
        this.unitPrice = price;
        System.out.println("Order Set successfully");
    }

    public void makeOrder(String name, int qty, double price, String address) {
        this.address = address;
        this.makeOrder(name, qty, price);
    }

    public void printOrder() {
        System.out.println("Order Details:");
        System.out.println("Product: "+itemName);
        System.out.print("Delivery Location: ");
        if (address != null) {
            System.out.println(address);
            System.out.println("Price: "+unitPrice+" tk X "+quantity+" = "+(quantity*unitPrice)+" tk");
            System.out.println(" + 50 tk Delivery charge = "+(quantity*unitPrice+50)+" tk");
        }
        else {
            System.out.println("No delivery address set");
            System.out.println("Price: "+unitPrice+" tk X "+quantity+" = "+(quantity*unitPrice)+" tk");
        }
    }
}
