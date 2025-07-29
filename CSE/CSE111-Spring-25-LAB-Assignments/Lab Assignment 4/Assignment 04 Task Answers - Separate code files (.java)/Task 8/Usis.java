//
//
//
//
//--TASK--08--Usis----------------------------
public class Usis {
  
  public int totalAdvisee = 0;
  public Student [] list = new Student [5];
  
  public Usis () {
    System.out.println("Usis is ready to use!");}
  
  public void login (Student a) {
    if (a.email == null) {
      System.out.println("Email and password need to be set.");}
    else {
      a.log = true;
      System.out.println("Login successful");}}
  
  public void advising (Student a) {
    if (a.log == false) {
      System.out.println("Please login to advise courses!");}
    else {
      System.out.println("You haven't selected any courses.");}}
  
  public void advising (Student a, String aa, String b, String c, String d) {
    if (a.log == false) {
      System.out.println("Please login to advise courses!");}
    else {
      System.out.println("You need special approval to take more than 3 courses.");}}
    
  public void advising (Student a, String aa, String b, String c) {
    if (a.log == false) {
      System.out.println("Please login to advise courses!");}
    else {
      a.courses [0] = aa;
      a.courses [1] = b;
      a.courses [2] = c;
      this.list [this.totalAdvisee] = a;
      this.totalAdvisee = this.totalAdvisee + 1;
      System.out.println("Advising successful!");}}
  
  public void allAdviseeInfo () {
    System.out.println("Total Advisee: "+totalAdvisee);
    for (int i = 0; i<totalAdvisee; i++) {
      System.out.println("Name: "+ list[i].name + " ID: "+ list[i].id);
      System.out.println("Department: "+ list[i].dept);
      System.out.println("Advised Courses:");
      for (int j = 0; j<3; j++) {
        System.out.print(list[i].courses[j]+" ");}
      System.out.println();
      System.out.println("==============");}}
}