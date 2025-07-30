//--TASK--01----------------------------------------
public class UniversityTester {
  public static void main (String [] args) {
    University a = new University ();
    University b = new University ();
    System.out.println("Location of the first object: "+a);
    System.out.println("Location of the second object: "+b);
    System.out.println("Instance variable of first object (name): "+a.name);
    System.out.println("Instance variable of first object (country): "+a.country);
    System.out.println("Instance variable of second object (name): "+b.name);
    System.out.println("Instance variable of second object (country): "+b.country);
    a.name = "Imperial College London";
    a.country = "England";
    b.name = "BRAC University";
    b.country = "Bangladesh";
    System.out.println("Instance variable of first object after change (name): "+a.name);
    System.out.println("Instance variable of first object after change (country): "+a.country);
    System.out.println("Instance variable of second object after change (name): "+b.name);
    System.out.println("Instance variable of second object after change (country): "+b.country);
  }
}