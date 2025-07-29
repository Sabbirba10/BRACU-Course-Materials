//
//
//
//
//--TASK--08----------------------------------------
public class Reader {
  public String name = "New user";
  public int capacity = 0;
  public int count;
  public String [] book;
  
  public String createReader (String a, int b) {
    this.name = a;
    this.capacity = b;
    book = new String [b];
    return "A new reader is created!";}
  
  public void readerInfo () {
    System.out.println("Name: "+name);
    System.out.println("Capacity: "+capacity);
    System.out.println("Books: ");
    if (count == 0) {
      System.out.println("No books added yet");}
    else {
      for (int i = 0; i<count; i++) {
        System.out.println("Book "+(i+1)+": "+this.book[i]);}}}
  
  public void addBook (String a) {
    if (count<capacity) {
      this.book[count] = a;
      this.count = this.count + 1;}
    else {
      System.out.println("No more capacity");}}
}