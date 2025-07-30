public class GameTester {
public static void main(String[] args) {
Character c1 = new Paladin("Arthur", 10);
Character c2 = new Mage("Merlin", 12);
Character c3 = new Warrior("Leon", 10);
c1.specialMove();
c2.specialMove();
c3.specialMove();
if (c1 instanceof Paladin) {
Paladin p = (Paladin) c1;
p.specialMove();
}
Warrior w1 = new Warrior("Leon", 10);
System.out.println("c3 equals w1? " + c3.equals(w1));
Mage m1 = new Mage("Merlin", 15);
System.out.println("c2 equals m1? " + c2.equals(m1));
}
} 