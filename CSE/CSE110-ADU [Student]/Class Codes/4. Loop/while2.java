// 0, 7, 14, 21, 28, 35, 42, 49
public class while2{
  public static void main(String [] args){
    int counter = 0;
    while(counter <= 49){
      if(counter == 49){
        System.out.print(counter);
      }else{
        System.out.print(counter + ", ");
      }
      counter += 7;
    }
  }
}