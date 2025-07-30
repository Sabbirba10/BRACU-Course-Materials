public class StudentTester{
public static void main (String args[]){
CSEStudent.details();
System.out.println("1--------------");
CSEStudent s1 = new CSEStudent("Bob", 23);
s1.info();
System.out.println("2--------------");
CSEStudent s2 = new CSEStudent("Don", 33);
s2.info();
System.out.println("3--------------");
s1.addLabBasedCourse("CSE220");
s1.addLabBasedCourse("CSE221");
System.out.println("4--------------");
s1.info();
System.out.println("5--------------");
CSEStudent.details();
System.out.println("6--------------");
s1.addLabBasedCourse("CSE230");
System.out.println("7--------------");
s1.info();
System.out.println("8--------------");
s2.addLabBasedCourse("CSE110");
s2.info();
}
}