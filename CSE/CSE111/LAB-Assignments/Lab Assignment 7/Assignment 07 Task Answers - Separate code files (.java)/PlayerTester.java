public class PlayerTester {
public static void main(String[] args) {
Player playerOne = new Player("Al-Nassr", "Ronaldo",
"Striker", 25, 32);
playerOne.calculateRatio();
playerOne.printDetails();
System.out.println("----------------");
Manager managerOne = new Manager("Real Madrid", "Zidane",
"Manager", 25);
managerOne.printDetails();
}
}