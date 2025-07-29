package Lec19_04May;

class GameObject {
    public int strength = 5;
    public String damage() {
        return "Damage: "+strength;
    }
    public String toString() {
        return "No weapons Equipped";
    }
}

class Weapon extends GameObject {
    public String equip = "Hands";
    public String damage() {
        return "Damage: "+strength;
    }
    public void levelUp() {
        strength += 2;
        System.out.println("Leveled up"+equip+".");
    }
}