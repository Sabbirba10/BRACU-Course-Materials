//
//
//
//
//
//--TASK--09-------------------------------------------
public class task9 {
  public static void main (String [] args) {
    int [] [] array = {{1, 0, 0},
                         {0, 1, 0},
                         {0, 0, 1}};
    boolean identity = true;
    for (int i = 0; i<array.length; i++) {
      for (int j = 0; j<array[0].length; j++) {
        if (i==j) {
          if (array[i][j]!=1) {
            identity = false;}}
        if (i!=j) {
          if (array[i][j]!=0) {
            identity = false;}}}}
    if (identity == true) {
      System.out.println("Identity Matrix");}
    if (identity == false) {
      System.out.println("Not an Identity Matrix");}
  }
}