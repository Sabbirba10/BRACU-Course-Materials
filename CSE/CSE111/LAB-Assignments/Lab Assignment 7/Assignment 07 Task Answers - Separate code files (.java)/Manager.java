//
//
//
//
//---TASK--08--Manager-------------------------------
public class Manager extends SportsPerson {
  public int win;
  
  public Manager (String a,String b,String c,int d) {
    super (a, b, c);
    win = d;
    earningPerMatch = win*1000;}
  
  public void printDetails () {
    int a = (int) earningPerMatch;
    System.out.println(getNameTeam());
    System.out.println("Team Role: "+role);
    System.out.println("Total Win: "+win);
    System.out.println("Match Earning: "+a+"k");}
  
}