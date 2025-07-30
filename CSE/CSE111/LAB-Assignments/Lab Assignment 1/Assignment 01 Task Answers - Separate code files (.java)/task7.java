//
//
//
//
//
//--TASK--07-------------------------------------------
import java.util.Scanner;
public class task7 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array N");
    int N = sc.nextInt();
    int count = 1;
    double [] array = new double [N];
    for (int i = 0; i<N; i++) {
      System.out.println("Enter array element "+(i+1));
      array[i] = sc.nextDouble();}
    for (int i = 1; i<N; i++) {
      boolean duplicate = false;
        if (array[i]==array[i-1]) {
          duplicate = true;}
        if (duplicate == false) {
          count = count + 1;}}
    double [] newarray = new double [count];
    count = 0;
    newarray[0] = array[0];
    for (int i = 1; i<N; i++) {
      boolean duplicate = false;
        if (array[i]==array[i-1]) {
          duplicate = true;}
        if (duplicate == true) {
          count = count + 1;}
        if (duplicate == false) {
          newarray[i-count] = array[i];}}
    System.out.print("New Array: ");
    for (int i = 0; i<newarray.length; i++) {
      System.out.print(newarray[i]+" ");}
    System.out.println();
    System.out.println("Removed elements: "+count);
  }
}