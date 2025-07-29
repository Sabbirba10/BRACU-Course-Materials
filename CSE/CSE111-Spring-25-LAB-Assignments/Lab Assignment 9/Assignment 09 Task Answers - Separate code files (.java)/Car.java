//
//
//
//
//--Task-06--Car----------------------------------
public class Car extends Vehicle {
  public String model;
  public int door;
  public boolean ai;
  
  public Car (String a, String b, int c, int d, int e, boolean f){
    super(a, c);
    super.setWheels(e);
    model = b;
    door = d;
    ai = f;}
  
  public String toString (){
    return "Car "+super.toString()+", Model: "+model+", Doors: "+door+", AI: "+ai;}
  
  public void startAutoPilot () {
    if (ai==false) {
      System.out.println(getBrand()+":"+model+" has NO AutoPilot");}
    else {
      System.out.println(getBrand()+":"+model+" AutoPilot Started");}}
}