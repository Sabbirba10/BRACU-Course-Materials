import java.util.Arrays;
public class printingArray{
  public static void main(String [] args){
    int [] arr = {15,2,3,5,11};
    printArr(arr, "-");
    System.out.println(Arrays.toString(arr));
//    int [] arr2 = {3,10,66,21,103,88};
//    printArr(arr2, "_");
  }
  public static void printArr(int [] a, String div){
    for(int i = 0; i < a.length; i++){
      if(i == a.length -1){
        System.out.println(a[i]);
      }else{
        System.out.print(a[i]+div);
      }
    }
//    a[1] = 555555;
  }
}