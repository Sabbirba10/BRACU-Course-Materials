public class ArrayTrace{
  public static void main(String [] args){
    int [] arr1 = {0, 0, 0, 0, 0};
    int [] arr2 = {1, 2, 3, 4, 5};
    int index1 = 0;
    int index2 = 0;
    index1 = 1;
    while(index1 < 5){
      arr1[index1] = index1+4;
      index2 = 1;
      while(index2<index1){
        arr1[index1] = arr2[index1] - arr1[index2] + index1;
        index2++;
      }
      if (index1 == 3)
        arr1 = arr2;
      System.out.println(arr1[index1]);
      index1++;
    }
  }
}
