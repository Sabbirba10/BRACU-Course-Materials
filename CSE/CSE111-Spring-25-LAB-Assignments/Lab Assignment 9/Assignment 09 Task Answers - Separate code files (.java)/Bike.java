//
//
//
//
//--Task-06--Bike----------------------------------
public class Bike extends Vehicle {
  public String model;
  public int door;
  public boolean sidecar;
  
  public Bike (String a, String b, int c, int d, boolean e){
    super(a, c);
    super.setWheels(d);
    model = b;
    sidecar = e;}
  
  public String toString (){
    return "Bike "+super.toString()+", Model: "+model+", SideCar: "+sidecar;}
  
  public void doAWheelie () {
    if (sidecar==false) {
      System.out.println(getBrand()+":"+model+" is doing Wheelie!!");}
    else {
      System.out.println("Wheelie Failed. "+getBrand()+":"+model+" has SideCar");}}
}