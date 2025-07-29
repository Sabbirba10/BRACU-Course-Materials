//
//
//
//
//---TASK--02---------------------------------
public class CustomerService {
  public String [] arr;
  public int count = 0;
  
  public CustomerService (int c) {
    arr = new String [c];}
  
  public void serveCustomer () {
    if (count==0) {
      System.out.println("No customers to serve");}
    else {
      System.out.println("Serving "+arr[0]);
      for (int i = 1; i<count; i++) {
        arr[i-1]=arr[i];
        if (i==(count-1)) {
          arr[i] = null;}}
      count = count-1;}}
  
  public void addCustomer (String a) {
    if (count==arr.length) {
      System.out.println("Queue is full. Cannot add "+a);}
    else {
      arr[count] = a;
      count = count+1;
      System.out.println("Added: "+a);}}
  
}