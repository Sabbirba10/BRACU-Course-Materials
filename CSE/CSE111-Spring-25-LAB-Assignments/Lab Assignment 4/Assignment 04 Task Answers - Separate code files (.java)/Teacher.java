//
//
//
//
//--TASK--06--Teacher----------------------------
public class Teacher {
  public String name;
  public String initial;
  public String [] courses = new String [3];
  public int count = 0;
  
  public Teacher (String a, String b) {
    name = a;
    initial = b;
    System.out.println("A new teacher has been created ");}
  
  public void addCourse (Course a) {
    if (count < 3) {
      this.courses [this.count] = a.name;
      this.count = this.count + 1;}}
  
  public void printDetail () {
    System.out.println("Name: "+name);
    System.out.println("Initial: "+initial);
    System.out.println("List of courses:");
    for(int i = 0; i<count; i++) {
      System.out.println(courses[i]);}}
}