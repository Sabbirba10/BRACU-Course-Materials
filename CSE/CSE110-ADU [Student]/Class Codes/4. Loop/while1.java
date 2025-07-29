// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
public class while1{
  public static void main(String [] args){
    int counter = 1;
    while(counter <= 10){ //1,2,3,4,5,6,7,8,9,10
      if(counter == 10){
        System.out.print(counter);
      }
      else{
        System.out.print(counter + ", ");
      }
//      counter += 1;
      counter++;
    }
//    int counter = 1;
//    while(counter <= 9){ //1,2,3,4,5,6,7,8,9,10
////      System.out.println("Hello");
//      System.out.print(counter + ", " );
//      
////      counter += 1;
//      counter++;
//    }
//    System.out.print(counter); //10
  }
}