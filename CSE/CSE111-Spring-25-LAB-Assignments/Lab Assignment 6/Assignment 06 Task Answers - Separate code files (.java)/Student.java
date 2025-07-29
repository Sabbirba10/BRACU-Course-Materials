//
//
//
//
//--TASK--7----------------------------------------------------
public class Student {
  public static int ts = 0;
  public static int cs = 0;
  public static int os = 0;
  public String name;
  public double cgpa;
  public String dept;
  public int id;
  
  public Student (String a, double b) {
    name = a;
    cgpa = b;
    dept = "CSE";
    ts = ts+1;
    cs = cs+1;
    id = ts;}
  
  public Student (String a, double b, String c) {
    name = a;
    cgpa = b;
    dept = c;
    ts = ts+1;
    os = os+1;
    id = ts;}
  
  public void individualDetail () {
    System.out.println("ID: "+id);
    System.out.println("Name: "+name);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Department: "+dept);}
  
  public static void printDetails () {
    System.out.println("Total Student(s): "+ts);
    System.out.println("CSE Student(s): "+cs);
    System.out.println("Other Department Student(s): "+os);}
  
}