class ArrayTest{
  public static void main(String[] args){
    int[] arr = {34,54,32,34,5,43,23};
    
    int max = Integer.MIN_VALUE;
    int max_i = 0;
    for( int i=1; i<arr.length; i++ ){
      if( arr[i]>max ){
        max = arr[i];
        max_i = i;
      }
    }
    System.out.println( "The max number is: "+max);
    System.out.println( "The max index is: "+max_i);
  }
}