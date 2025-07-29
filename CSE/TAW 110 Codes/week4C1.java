public class week4C1
{
  public static void main(String[]args)
  {
    int num = 7;
    if(num>10){
      if(num%2==0){
        System.out.println(num+" is greater than 10 and even");
      }
      else{
        System.out.println(num+" is greater than 10 and odd");
      }
    }
    else{
      if(num%4==0){
        System.out.println(num+" is less than 10 and div by 4");
      }
      else{
        System.out.println(num+" is less than 10 but not div by 4");
      }
    }
  }
}