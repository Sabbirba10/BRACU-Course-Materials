//
//
//
//
//--TASK--03------------------------------
public class Shape2D {
  
  public String check;
  public int length;
  public int breadth;
  public int height;
  public int base;
  public int side1;
  public int side2;
  public int side3;
  
  public Shape2D () {
    this.length = 5;
    check = "sq";
    System.out.println("A Square has been created with length: "+this.length);}
  
  public Shape2D (int a, int b) {
    this.length = a;
    this.breadth = b;
    check = "rc";
    System.out.println("A Rectangle has been created with length: "+this.length+" and breadth: "+this.breadth);}
  
  public Shape2D (int a, int b, String c) {
    this.height = a;
    this.base = b;
    check = "tr1";
    System.out.println("A Triangle has been created with height: "+this.height+" and base: "+this.base);}
  
   public Shape2D (int a, int b, int c) {
    this.side1 = a;
    this.side2 = b;
    this.side3 = c;
    check = "tr2";
    System.out.println("A Triangle has been created with the following sides:"+this.side1+", "+this.side2+", "+this.side3);}
  
  public void area () {
    if (this.check=="sq") {
      double area = this.length*this.length;
      System.out.println("The area of the Square is: "+area);}
    if (this.check=="rc") {
      double area = this.length*this.breadth;
      System.out.println("The area of the Rectangle is: "+area);}
    if (this.check=="tr1") {
      double area = 0.5*this.height*this.base;
      System.out.println("The area of the Rectangle is: "+area);}
    if (this.check=="tr2") {
      double s = (this.side1 + this.side2 + this.side3)/2;
      double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
      System.out.println("The area of the Triangle is: "+area);}}
}