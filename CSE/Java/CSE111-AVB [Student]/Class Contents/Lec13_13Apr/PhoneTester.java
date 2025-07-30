package Lec13_13Apr;

public class PhoneTester{
  @SuppressWarnings("static-access")
  public static void main(String[] args) {
    Phone s25 = new Phone("S25");
    Phone a53 = new Phone("A53");
    a53.details();
    s25.details();
    System.out.println("================");
    // Changes from one obj applies to all obj
    s25.brand = "Samsung Galaxy";
    a53.details();
    System.out.println("================");
    // Proper way to access static variables
    Phone.brand = "NVidia Galaxy";
    s25.details();
    System.out.println("================");
    // Proper way to use static methods
    Phone.updateVersion(15.5);
    a53.details();
    s25.details();

  }
}