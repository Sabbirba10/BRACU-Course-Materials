//
//
//
//
//
//--TASK--04-------------------------------------------
import java.util.Scanner;
public class task4 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a string in small letters");
    String a = sc.nextLine();
    for (int i = 0; i<a.length(); i++) {
      int check = a.codePointAt(i)-1;
      if (check == 96) {
        check = 122;}
      System.out.print((char)check);}
  }
}