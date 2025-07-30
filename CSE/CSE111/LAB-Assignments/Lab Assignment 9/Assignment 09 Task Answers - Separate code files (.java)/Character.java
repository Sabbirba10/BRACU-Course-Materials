//
//
//
//
//--Task-05--Character--Parent--------------------------------
public class Character {
public String name;
public int level;
public Character(String name, int level) {
this.name = name;
this.level = level;
}
public void specialMove() {
System.out.println("Character uses a generic move.");
}
// Override the .equals() method
  public boolean equals (Character a) {
    if ((this.name == a.name) && (this.level == a.level)) {
      return true;}
    else {
      return false;}}
}