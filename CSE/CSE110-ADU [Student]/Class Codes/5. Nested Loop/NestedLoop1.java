public class NestedLoop1{   
  public static void main(String[] args)  { 
    for ( int i = 0 ; i < 2 ; i++ ) {
      for ( int j = 0 ; j < 3 ; j++ ) {
        System.out.println(i+" "+j);
      }
      System.out.println("inner loop ended");
    }
    System.out.println("outer loop ended");
  }
}
