//
//
//
//
//--TASK--08----------------------------------------------------
public class Player {
  public static int total = 0;
  public static String [] arr = new String [11];
  public String name;
  public int number;
  public String country;
  
  public Player (String a, String b, int c) {
    name = a;
    number = c;
    country = b;
    arr[total]=a;
    total = total+1;}
  
  public String player_detail () {
    return "Player Name: "+name+"\nJersey Number: "+number+"\nCountry: "+country;}
  
  public static void info () {
    System.out.println("Total number of players: "+total);
    System.out.print("Players enlisted so far: ");
    for (int i = 0; i<total; i++) {
      System.out.print(arr[i]+", ");}
    System.out.println();}
  
}