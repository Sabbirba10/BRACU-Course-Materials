//
//
//
//
//--TASK--03----------------------------------------------------
public class Book {
  public static int total_books_sold = 0;
  public static double total_revenue = 0.0;
  public String title;
  public double price;
  
  public Book (String a, int b) {
    title = a;
    price = 150.0 - (150.0*(b/100.0));
    total_books_sold = total_books_sold + 1;
    total_revenue = total_revenue + price;}
  
  public void bookDetails () {
    System.out.println("Title: "+title);
    System.out.println("Price after Discount: "+price+" TK");}
  
}