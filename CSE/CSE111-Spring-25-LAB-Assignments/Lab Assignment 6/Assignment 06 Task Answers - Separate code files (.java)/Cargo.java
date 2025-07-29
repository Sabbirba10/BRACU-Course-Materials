//
//
//
//
//--TASK--06----------------------------------------------------
public class Cargo {
  public static double capacity = 10.0;
  public static int count = 0;
  public int id;
  public String content;
  public double weight;
  public boolean check = false;
  
  public Cargo (String a, double b) {
    content = a;
    weight = b;
    count = count+1;
    id = count;}
  
  public static double capacity () {
    return capacity;}
  
  public void details () {
    System.out.println("Cargo ID: "+id+", Contents: "+content+", Weight: "+weight+", Loaded: "+check);}
  
  public void load () {
    if (weight>capacity){
      System.out.println("Cannot load cargo, exceeds weight capacity.");}
    else {
      check = true;
      capacity = capacity - weight;
      System.out.println("Cargo "+id+" loaded for transport.");}}
  
  public void unload () {
      check = false;
      capacity = capacity + weight;
      System.out.println("Cargo "+id+" unloaded.");}
  
}