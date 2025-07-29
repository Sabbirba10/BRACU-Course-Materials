class Boss extends Person{
  String ability;
  String price = "Infinity";
  
  public Boss(String nm, String ab){
    super(nm);
    this.ability = ab;
    System.out.println("Creating a boss");
  }
  
  public void showDialogue(){
    System.out.println("MY NAME IS "+name+"!!! My ability is "+this.ability);
    System.out.println("Price is "+this.price+"!!!");
  }
  
  public void showBoss(){
    showDialogue();
    System.out.println("I'm the boss!!!");
  }
  
  
  public boolean equals(Boss b2){
    String sb1 = this.toString();
    String sb2 = b2.toString();
    return sb1.equals( sb2 );
  }
  
  public String toString(){   
    String s = "Name: "+super.name;
    s += ", Ability: "+this.ability;
    s += ", Price: "+this.price;
    return s;
  }
  
}