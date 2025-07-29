//
//
//
//
//---TASK--05--Tennis-------------------------------
public class Tennis_Tournament extends Tournament {
  public int num;
  
  public Tennis_Tournament (String a, int b) {
    setName(a);
    num = b;}
  
  public String detail () {
    return "Tennis Tournament Name: "+getName()+"\nNumber of Players: "+num;}
  
}