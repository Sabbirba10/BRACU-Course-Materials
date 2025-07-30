//
//
//
//
//--TASK--02------------------------------
public class Toy {
  
  public String name;
  public int price;
  
  public Toy (String a, int b) {
    this.name = a;
    this.price = b;
    System.out.println("A new toy has been made!");}
  
  public void updatePrice (int a) {
    this.price = a;}
  
  public void showPrice () {
    System.out.println("Price: "+this.price+" Taka");}
  
  public void updateName (String a) {
    System.out.println("Changing old name: "+this.name);
    this.name = a;
    System.out.println("new name: "+this.name);}
  
}