
public class breakScanario{   
  public static void main(String[] args)  { 
    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 4; j++){
        if(j == 2){
          break;
        }
        System.out.println("after break");
      }
      System.out.println("Outside inner loop");
    }
  }
}
