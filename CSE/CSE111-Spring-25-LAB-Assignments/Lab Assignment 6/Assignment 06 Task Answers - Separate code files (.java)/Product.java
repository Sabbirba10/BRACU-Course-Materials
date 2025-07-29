//
//
//
//
//--TASK--01----------------------------------------------------
public class Product {
  private String name;
  private double price;
  private int quantity = 0;
  
  public Product () {
    name = "Unknown";
    price = 0.0;}
  
  public Product (String a, double b) {
    name = a;
    price = b;}
  
  public void displayInfo () {
    System.out.println("Product Name: "+name);
    System.out.println("Price: $"+price);}
  
  public void displayInfo (boolean a) {
    if (a==true) {
      System.out.println("Product Name: "+name);
      System.out.println("Price: $"+price);
      System.out.println("Quantity: "+quantity);}}
  
  public void setQuantity (int a) {
    quantity = a;}
  
  public double getPrice () {
    return price;}
  
  public double getQuantity () {
    return quantity;}
  
}