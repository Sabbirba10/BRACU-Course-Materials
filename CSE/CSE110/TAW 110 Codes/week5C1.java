public class week5C1
{
  public static void main(String[]args)
  {
    int count = 1;       // initialization
    while(count<=100){    // Condition
      if(count%4==0){
        System.out.println(count+" div by 4");  // Body.
      }else{
        System.out.println(count+" Jani na");
      }
      count += 1;                           //steps
    }
    System.out.println("Last line of the code");
  }
}