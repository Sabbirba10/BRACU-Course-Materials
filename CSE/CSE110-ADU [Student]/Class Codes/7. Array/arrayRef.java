import java.util.Arrays;
public class arrayRef{
  public static void main(String [] args){
    int [] arr = {10,20,30,40};
    int [] arr2 = {1,2,3,4};
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
    System.out.println("==================");
    arr[1] = arr2[3];
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
    System.out.println("==================");
    arr = arr2;
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
    System.out.println("==================");
    arr[1] = 500;
//    System.out.println(arr2[1]);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(arr2));
  }
}
    