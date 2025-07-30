public class TracingPractice{
  public static void main(String[] args) {
    int x = 1;
    int y = 3;
    int sum = 0;
    boolean flag = false;
    while (x < 5) {
      if (flag == true) {
        System.out.println(++sum);
        flag = false;
      }
      else {
        sum += (x % 3) + (sum/2) + y - 2;
        System.out.println(sum++);
        y += 3;
        flag = true;
      }
      x += 1;
    }
    System.out.println(y++ + sum + ++y);
  }
}