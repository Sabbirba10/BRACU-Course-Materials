package Lec08_04Mar;

public class Tester {
    public static void main(String[] args) {
        System.out.println("1------------");
        OrderItem item1 = new OrderItem();
        item1.makeOrder("Jacket: Size L", 2, 1300);
        System.out.println("2------------");
        item1.printOrder();
        System.out.println("3------------");
        item1.address = "Gulshan";
        item1.printOrder();
        System.out.println("4------------");
        OrderItem item2 = new OrderItem();
        item2.makeOrder("Notebook", 5, 80, "Banani");
        System.out.println("5------------");
        item2.printOrder();
        System.out.println("6------------");


        // System.out.println("7------------");
        // Item item_1 = new Item("Jacket: Size L", 2, 1300);
        // System.out.println("8------------");
        // item_1.printOrder();
        // System.out.println("9------------");
        // item_1.address = "Gulshan";
        // item_1.printOrder();
        // System.out.println("10-----------");
        // Item item_2 = new Item("Notebook", 5, 80, "Banani");
        // System.out.println("11-----------");
        // item_2.printOrder();
        // System.out.println("12-----------");
    }
}
