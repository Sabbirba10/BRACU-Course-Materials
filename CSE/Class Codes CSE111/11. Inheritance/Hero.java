class Hero extends Person{
  String ability;
  
  public Hero(String nm, String ab){
    super(nm);
    this.ability = ab;
    System.out.println("Creating a hero");
  }  
  
  @Override
  public void showDialogue(){
    System.out.println("My name is " +this.name+".. I'm the Hero!!!");
  }
  
  public void showHero(){
    System.out.println("My ability is "+this.ability+"!!!!!");
  }
  
  @Override
  public String toString(){   
    String s = "Name: "+super.name;
    s += ", Ability: "+this.ability;
    return s;
  }
  
}