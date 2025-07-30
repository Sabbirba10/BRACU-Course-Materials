//
//
//
//
//--TASK--04--------------------------------------
public class Vehicle2010 extends Vehicle {
  
  public void moveLowerLeft () {
    super.moveDown();
    super.moveLeft();}
  
  public void moveUpperRight () {
    super.moveUp();
    super.moveRight();}
  
  public void moveLowerRight () {
    super.moveDown();
    super.moveRight();}
}