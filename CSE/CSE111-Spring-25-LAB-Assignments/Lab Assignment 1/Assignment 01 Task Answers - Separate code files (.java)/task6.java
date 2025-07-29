//
//
//
//
//
//--TASK--06-------------------------------------------
import java.util.Scanner;
public class task6 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array N");
    int N = sc.nextInt();
    int [] array = new int [N];
    for (int i = 0; i<N; i++) {
      System.out.println("Enter array element "+(i+1));
      array[i] = sc.nextInt();}
    for (int i = 0; i<N; i++) {
      boolean duplicate = false;
      for (int j = 0; j<i; j++) {
        if (array[i]==array[j]) {
          duplicate = true;}}
      if (duplicate == false) {
        int count = 1;
        for (int j = i+1; j<N; j++) {
          if (array[i]==array[j]) {
            count = count + 1;}}
        System.out.println(array[i]+" - "+count+" times");}}
  }
}