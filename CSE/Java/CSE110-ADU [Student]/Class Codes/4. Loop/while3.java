// 0, -7, 14, -21, 28, -35, 42, -49
public class while3{
  public static void main(String [] args){
    int counter = 0;
    while(counter <= 49){
      if(counter == 49){
        System.out.print(-1*counter);
      }
      else if(counter % 2 != 0){
        System.out.print(-1*counter + ", ");
      }
      else{
        System.out.print(counter + ", ");
      }
      counter += 7;
    }
  }
}

//1, -3, 5, -7, 9, -11, 13, -15