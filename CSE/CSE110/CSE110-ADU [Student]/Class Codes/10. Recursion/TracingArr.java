public class TracingArr{
  public static void main(String[] args) {
    int [] b = {9, 15, -2, 11, 7};
    System.out.println(metA(b, 0)); 
  }
  public static int metA(int[] a, int i) {
    if (i == a.length - 1) {
      return a[i];
    }
    int x = metA(a, i + 1);
//    System.out.println(a[i] + x);
    if (a[i] < x) {
      return a[i];
    } else {
      return x;
    }
  }
}