package Lec08_04Mar;

public class Item {
    public String itemName;
    public int quantity;
    private double unitPrice;
    public String address;

    public Item(String name, int qty, double price) {
        this(name, qty, price, null);
    }

    public Item(String name, int qty, double price, String address) {
        this.itemName = name;
        this.quantity = qty;
        this.unitPrice = price;
        this.address = address;
        System.out.println("Order Set successfully");
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
