public class recursionSum{
  public static void main(String [] args){
    int ans = sumRec(4);
    System.out.println(ans);
  }
  public static int sumRec(int num){
    if(num == 0){ //base case
      return 0;
    }else{  //recursive case
//      int temp = sumRec(num-1);
//      int sum = num + temp;
//      return sum;
      return num + sumRec(num-1);
    }
  }
}