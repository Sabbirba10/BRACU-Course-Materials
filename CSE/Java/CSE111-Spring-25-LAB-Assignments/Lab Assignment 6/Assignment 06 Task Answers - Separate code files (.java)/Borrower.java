//
//
//
//
//--TASK--05----------------------------------------------------
public class Borrower {
  public static int [] book_count = {3,3,3};
  public static String [] book_name = {"Pather Panchali","Durgesh Nandini","Anandmath"};
  public String name;
  public String [] borrowed = new String [3];
  public int count = 0;
  
  public Borrower (String a) {
    name = a;}
  
  public static void bookStatus () {
    System.out.println("Available Books: ");
    for (int i = 0; i<3; i++) {
      System.out.println(book_name[i]+" : "+book_count[i]);}}
  
  public void borrowBook (String a) {
    int temp = -1;
    for (int i = 0; i<3; i++) {
      if (book_name[i].equals(a)) {
        temp = i;}}
    if (book_count[temp]<1) {
      System.out.println("This book is not available.");}
    else {
      borrowed[count] = a;
      count = count + 1;
      book_count[temp] = book_count[temp]-1;}}
  
  public void borrowerDetails () {
    System.out.println("Name: "+name);
    System.out.println("Books Borrowed:");
    for (int i = 0; i<count; i++) {
      System.out.println(borrowed[i]);}}
  
  public static int remainingBooks (String a) {
    int temp = -1;
    for (int i = 0; i<3; i++) {
      if (book_name[i].equals(a)) {
        temp = i;}}
    return book_count[temp];}
  
}