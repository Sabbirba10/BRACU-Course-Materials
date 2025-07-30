package Lec19_04May;

class Crossbow extends Weapon {
    public String equip = "Crossbow";
    public int strength = 10;
    public String damage() {
        return "Damage: "+strength;
    }
    public String toString() {
        return "Equipped Crossbow ("+strength+")";
    }
}
class Sword extends Weapon {
    public String equip = "Sword";
    public int strength = 3;
    public String damage() {
        return "Damage: "+strength+super.strength;
    }
    public void levelUp() {
        strength += 3;
        System.out.println("Leveled up"+equip+".");
    }
    public String toString() {
        return "Equipped Sword ("+strength+")";
    }
}