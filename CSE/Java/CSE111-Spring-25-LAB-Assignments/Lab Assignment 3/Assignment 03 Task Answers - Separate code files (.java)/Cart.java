//
//
//
//
//--TASK--07----------------------------------------
public class Cart {
  public double DiscountApplied;
  public double Totalprice;
  public int num;
  public int count;
  public String [] item = new String [3];
  public double [] price = new double [3];
  
  public void create_cart (int a) {
    this.num = a;}
  
  public void addItem (String a, double b) {
    if (count<3) {
      this.item[count] = a;
      this.price[count] = b;
      this.count = this.count+1;
      this.Totalprice = this.Totalprice+b;
      System.out.println(a+" added to cart "+num);
      System.out.println("You have "+count+" item(s) in your cart now");}
    else {
      System.out.println("You already have 3 items on your cart");}}
  
  public void addItem (double a, String b) {
    if (count<3) {
      this.item[count] = b;
      this.price[count] = a;
      this.count = this.count+1;
      this.Totalprice = this.Totalprice+a;
      System.out.println(b+" added to cart "+this.num);
      System.out.println("You have "+this.count+" item(s) in your cart now");}
    else {
      System.out.println("You already have 3 items on your cart");}}
  
  public void cartDetails () {
    System.out.println("Your cart(c"+num+") :");
     for (int i = 0; i<count; i++) {
      System.out.println(this.item[i]+" - "+this.price[i]);}
     System.out.println("Discount Applied: "+DiscountApplied+"%");
     System.out.println("Total price :"+Totalprice);}
  
  public void giveDiscount (double a) {
    this.Totalprice = this.Totalprice - (this.Totalprice*(a/100));
    this.DiscountApplied = a;}
}