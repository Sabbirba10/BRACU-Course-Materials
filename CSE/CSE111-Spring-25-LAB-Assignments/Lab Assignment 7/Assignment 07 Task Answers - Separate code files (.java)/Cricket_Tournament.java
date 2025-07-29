//
//
//
//
//---TASK--05--Cricket-------------------------------
public class Cricket_Tournament extends Tournament {
  public int num;
  public String type;
  
  public Cricket_Tournament () {
    num = 0;
    type = "No type";}
  
  public Cricket_Tournament (String a, int b, String c) {
    setName(a);
    num = b;
    type = c;}
  
  public String detail () {
    return "Cricket Tournament Name: "+getName()+"\nNumber of Teams: "+num+"\nType: "+type;}
  
}