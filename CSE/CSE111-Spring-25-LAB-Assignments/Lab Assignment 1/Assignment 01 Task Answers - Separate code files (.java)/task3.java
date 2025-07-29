//
//
//
//
//
//--TASK--03-------------------------------------------
import java.util.Scanner;
public class task3 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st String");
    String a = sc.nextLine();
    System.out.println("Enter 2nd String");
    String b = sc.nextLine();
    String c = a+" "+b;
    int sum = 0;
    for (int i = 0; i<c.length(); i++) {
      int check = c.codePointAt(i);
      if (check>64&&check<91 || check>96&&check<123) {
        sum = sum + check;}}
    System.out.println(c);
    System.out.println(sum);
  }
}