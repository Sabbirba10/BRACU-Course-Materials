package Lec15_20Apr.Two;

public class IceCreamTester1 {
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
  System.out.println("== PARAMETERIZED ==");
  System.out.println("==================");
  IceCream a1 = new IceCream("Vanilla");
  System.out.println("Ice-cream Flavour: " + a1.flavour);
  System.out.println("==================");
  BoxIceCream b1 = new BoxIceCream("Mango", 1.5);
  System.out.println("Box Ice-cream Flavour: " + b1.flavour);
  System.out.println("Size:" + b1.size + " " + b1.unit);
  System.out.println("==================");
  ConeIceCream c1 = new ConeIceCream("Chocolate", 2);
  System.out.println("Cone Ice-cream Flavour: " + c1.flavour);
  System.out.println("Size:" + c1.size + " " + c1.unit);
  System.out.println("==================");
 }
}