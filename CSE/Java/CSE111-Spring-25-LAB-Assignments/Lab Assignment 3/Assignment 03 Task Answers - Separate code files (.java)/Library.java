//
//
//
//
//--TASK--05----------------------------------------
public class Library {
  public int MaximumCapacity;
  public int TotalBooks;
  public String [] Booklist;
  
  public void setBookCapacity (int a) {
    this.MaximumCapacity = a;}
  
  public void addBook (String a) {
    if (TotalBooks == 0) {
      Booklist = new String [MaximumCapacity];}
    if (TotalBooks < MaximumCapacity) {
      this.Booklist[TotalBooks] = a;
      this.TotalBooks = this.TotalBooks + 1;
      System.out.println("Book '"+a+"' added to the library");}
    else {
      System.out.println("Exceeds maximum capacity. You can't add more than "+MaximumCapacity+" books");}}
  
  public void printDetail () {
    System.out.println("Maximum Capacity: "+MaximumCapacity);
    System.out.println("Total Books: "+TotalBooks);
    System.out.println("Book list:");
    for (int i = 0; i<TotalBooks; i++) {
      System.out.println(this.Booklist[i]);}}
}