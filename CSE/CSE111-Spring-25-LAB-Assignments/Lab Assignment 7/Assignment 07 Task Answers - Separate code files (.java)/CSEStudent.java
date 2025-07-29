//
//
//
//
//---TASK--07---------------------------------
public class CSEStudent extends Student {
  public static int total = 0;
  
  public CSEStudent (String a, int b) {
    super (a, b);
    total = total + 1;}
  
  public static void details () {
    System.out.println("Total CSE Students: "+total);
    System.out.println("Available Lab Based Courses: ");
    System.out.println("CSE110 CSE111 CSE220 CSE221");}
  
  public void addLabBasedCourse (String a) {
    if (a.equals("CSE110")||a.equals("CSE111")||a.equals("CSE220")||a.equals("CSE221")) {
      courses = courses+a+" ";}
    else {
      System.out.println("It is not a lab based course!");}}
  
}