//
//
//
//
//---TASK--08--Player-------------------------------
public class Player extends SportsPerson {
  public int goal;
  public int match;
  public double ratio;
  
  public Player (String a,String b,String c,int d,int e) {
    super (a, b, c);
    goal = d;
    match = e;
    earningPerMatch = (goal*1000) + (match*10);}
  
  public void calculateRatio () {
    ratio = goal/(match*1.0);}
  
  public void printDetails () {
    int a = (int) earningPerMatch;
    System.out.println(getNameTeam());
    System.out.println("Team Role: "+role);
    System.out.println("Total Goal: "+goal+", Total Played: "+match);
    System.out.println("Goal Ratio: "+ratio);
    System.out.println("Match Earning: "+a+"k");}
  
}