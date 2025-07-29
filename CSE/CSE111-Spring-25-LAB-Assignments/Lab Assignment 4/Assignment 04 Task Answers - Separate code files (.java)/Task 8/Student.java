//
//
//
//
//--TASK--08--Student----------------------------
public class Student {
  
  public String name;
  public int id;
  public String dept;
  public String [] courses = new String [3];
  public String email;
  public String password;
  public boolean log = false;
  
  public Student (String a, int b, String c) {
    this.name = a;
    this.id = b;
    this.dept = c;
    System.out.println("Student object is created");}
}