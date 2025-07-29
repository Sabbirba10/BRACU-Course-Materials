public class Game333Tester {
public static void main(String[] args) {
Garage g = new Garage(2, 3);
System.out.println("==========0===========");
Vehicle vC1 = new Car("Ford", "Mustang", 2022, 2,4, false);
Vehicle vC2 = new Car("Tesla", "Model S", 2025, 4,4, true);
Vehicle vC3 = new Car("Reliant", "Robin", 1981, 2,3, false);
System.out.println("==========1===========");
System.out.println(vC1);
System.out.println("==========2===========");
g.addVehicle(vC1);
g.addVehicle(vC2);
g.addVehicle(vC3);
System.out.println(g.cars[1]);
System.out.println("==========3===========");
g.cars[0].startAutoPilot();
g.cars[1].startAutoPilot();
System.out.println("==========4===========");
Vehicle vB1 = new Bike("Honda", "Gold Wing", 2022,3, true);
System.out.println(vB1);
g.addVehicle( vB1 );
System.out.println("==========5===========");
Vehicle vB2 = new Bike("Royal Enfield", "Classic350", 2021, 2, false);
g.addVehicle( vB2 );
System.out.println(g.bikes[1]);
System.out.println("==========6===========");
Vehicle vB3 = new Bike("Harley-Davidson", "Street750", 2022, 2, false);
g.addVehicle( vB3 );
Vehicle vB4 = new Bike("Yamaha", "MT-15", 2023, 2,
false);
g.addVehicle( vB4 );
System.out.println("=========7============");
g.bikes[0].doAWheelie();
g.bikes[1].doAWheelie(); }}