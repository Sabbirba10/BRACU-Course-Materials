//
//
//
//
//--TASK--05------------------------------
public class Triangle {
  
  public int t1;
  public int t2;
  public int t3;
  
  public Triangle (int a, int b, int c) {
    this.t1 = a;
    this.t2 = b;
    this.t3 = c;}
  
  public void triangleDetails () {
    System.out.println("Three sides of the triangle are: "+t1+", "+t2+", "+t3);
    System.out.println("Perimeter: "+(t1+t2+t3));}
  
  public String printTriangleType () {
    if (t1==t2 && t2==t3) {
      return "This is an Equilateral Triangle.";}
    if (t1==t2 || t2==t3 || t3==t1) {
      return "This is an Isosceles Triangle.";}
    else {
      return "This is an Scalene Triangle.";}}
  
  public void compareTrinagles (Triangle a) {
    if (this == a) {
      System.out.println("These two triangle objects have the same address.");}
    else {
      if (this.t1 == a.t1 && this.t2 == a.t2 && this.t3 == a.t3) {
        System.out.println("Addresses are different but the sides of the triangles are equal.");}
      else if ((this.t1+this.t2+this.t3)==(a.t1+a.t2+a.t3)) {
        System.out.println("Only the perimeter of both triangles is equal.");}
      else {
        System.out.println("Addresses, length of the sides and perimeter all are different. ");}}}
}