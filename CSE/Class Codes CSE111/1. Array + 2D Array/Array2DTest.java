class Array2DTest{
  public static void print2DArr( int[][] arr ){
    int row = arr.length;
    int col = arr[0].length;
    for( int i=0; i<row; i++){
      for( int j=0; j<col; j++)
        System.out.print(arr[i][j]+" ");
      System.out.println();
    }
  }
  public static int[][] sum2DArr( int[][] a1, int[][] a2 ){
    int row = a1.length;
    int col = a1[0].length;
    if( row==a2.length && col==a2[0].length ){
      //Creating a new matrix
      int[][] sArr = new int[row][col];
      for( int i=0; i<row; i++){
        for( int j=0; j<col; j++)
          sArr[i][j] = a1[i][j]+a2[i][j];
      }
      return sArr;
    } else {
      System.out.println("Dimension Mismatch!");
      int[][] dArr = new int[0][0];
      return dArr;
    }
    
    
  }
  public static void main(String[] args){
    
    int[][] arr1 = {
      {34,54},
      { 5,43},
      { 9,3}
    };
    int[][] arr2 = {
      { 4,23},
      {14,20},
      {4,2},
    };
    
    int[][] newArr = sum2DArr( arr1, arr2 );
    print2DArr(newArr);
  }
}