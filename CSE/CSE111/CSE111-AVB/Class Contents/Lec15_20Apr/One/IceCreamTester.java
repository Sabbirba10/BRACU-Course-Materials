package Lec15_20Apr.One;

public class IceCreamTester {
 public static void main(String[] args) {
  IceCream a = new IceCream();
  a.flavour = "Vanilla";
  System.out.println("Ice-cream Flavour:" + a.flavour);
  System.out.println("==================");
  BoxIceCream b = new BoxIceCream();
  b.flavour = "Mango";
  b.size = 1.5;
  b.unit = "Litres";
  System.out.println("Box Ice-cream Flavour:" + b.flavour);
  System.out.println("Size:" + b.size + " " + b.unit);
  System.out.println("==================");
  ConeIceCream c = new ConeIceCream();
  c.flavour = "Chocolate";
  c.size = 2;
  c.unit = "Scoops";
  System.out.println("Cone Ice-cream Flavour:" + c.flavour);
  System.out.println("Size:" + c.size + " " + c.unit);
  System.out.println("==================");
 }
}
