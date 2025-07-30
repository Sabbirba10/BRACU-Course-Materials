public class ArrayIter{
  public static void main(String[] args) {
    int [] arr = {5,7,13,6,1};
    printForward(arr, 0);
  }
  public static void printForward(int [] a, int idx){
    if(idx == a.length){
//      return;
    }
    else{
//      System.out.println(a[idx]);
      printForward(a, idx+1);
      System.out.println(a[idx]);
    }
  }
}

//print even elements
//find max, min

