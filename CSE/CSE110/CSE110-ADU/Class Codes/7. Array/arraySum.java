//{1,2,3,4}
//{10,20,30,40}
//{101,102,103,104}
import java.util.Arrays;
public class arraySum{
  public static void main(String [] args){
    int [] arr1 = {1,2,3,4};
    int [] arr2 = {10,20,30,40,50};
    int [] sumArray = new int[arr1.length];
    for(int i = 0; i < arr1.length; i++){
      int sum = arr1[i]; // 2
      for(int j = 0; j < arr2.length; j++){
        sum += arr2[j];                    //sum = sum + arr2[j] = 2 + 10
      }
      sumArray[i] = sum;
//      System.out.println(sum);
    }
    System.out.println(Arrays.toString(sumArray));
  }
}

//{1,2,3,4}
//{10,20,30,40}
//{11,22,33,44}

