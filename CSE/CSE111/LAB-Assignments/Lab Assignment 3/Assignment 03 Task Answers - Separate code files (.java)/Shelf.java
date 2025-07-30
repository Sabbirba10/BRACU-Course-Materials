//
//
//
//
//--TASK--03----------------------------------------
public class Shelf {
  public int capacity;
  public int Numberofbooks;
  
  public void showDetails () {
    System.out.println("Shelf capacity: "+capacity);
    System.out.println("Number of books: "+Numberofbooks);}
  
  public void addBooks (int a) {
    if (this.capacity==0) {
      System.out.println("Zero capacity. Cannot add books.");}
    else if (this.capacity>this.Numberofbooks+a) {
      this.Numberofbooks = this.Numberofbooks + a;
      System.out.println(a+" books added to shelf");}
    else {
      System.out.println("Exceeds capacity");}}
}