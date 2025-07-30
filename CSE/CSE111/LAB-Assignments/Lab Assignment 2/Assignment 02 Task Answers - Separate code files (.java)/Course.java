//
//
//
//
//--TASK--05----------------------------------------
public class Course {
  public String courseName;
  public String courseCode;
  public int courseCredit;
  
  public void updateDetails (String a, String b, int c) {
    this.courseName = a;
    this.courseCode = b;
    this.courseCredit = c;}
  
  public void displayCourse () {
    System.out.println("Course Name: "+courseName);
    System.out.println("Course Code: "+courseCode);
    System.out.println("Course Credit: "+courseCredit);}
}