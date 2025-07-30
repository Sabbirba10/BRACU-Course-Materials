//
//
//
//
//
//--TASK--02-------------------------------------------
import java.util.Scanner;
public class task2 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int count = 0;
    System.out.println("Enter 1st Integer");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Integer");
    int b = sc.nextInt();
    if (a>b) {
      int temp = a;
      a = b;
      b = temp;}
    for (int i = a; i<=b; i++) {
      boolean prime = true;
      for (int j = 2; j<i; j++) {
        if (i%j == 0) {
          prime = false;}}
      if (prime == true) {
        count = count+1;}}
    System.out.println("There are "+count+" prime numbers between "+a+" and "+b);
  }
}