//
//
//
//
//---TASK--01---------------------------------
public class BrowserHistory {
  public String [] arr;
  public int count = 0;
  
  public BrowserHistory (int c) {
    arr = new String [c];}
  
  public void showHistory () {
    if (count==0) {
      System.out.println("No web pages visited yet.");}
    else {
      System.out.println("Browser History:");
      for (int i = 0; i<count; i++) {
        System.out.println(arr[i]);}}}
  
  public void currentWeb () {
    if (count==0) {
      System.out.println("You have not visited any website yet!");}
    else {
      System.out.println("Current web page: "+arr[count-1]);}}
  
  public void visitWeb (String a) {
    if (count==arr.length) {
      System.out.println("History is full. Cannot visit "+a+" web page. ");}
    else {
      arr[count] = a;
      count = count+1;
      System.out.println("Visited: "+a);}}
  
  public void back () {
    arr[count-1] = null;
    count = count-1;}
  
}