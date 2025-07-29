//
//
//
//
//--Task-01------------------------------------
public class Pokemon {
  public String name;
  
  public Pokemon (String a) {
    name = a;}
  
  public void attack() {
    System.out.println(name+" attacks with a basic move!");}
  
  public void attack(String a) {
    System.out.println(name+" uses "+a+"!");}
  
  public void attack(String a, int b) {
    System.out.println(name+" uses "+a+" with power "+b+"!");}
}