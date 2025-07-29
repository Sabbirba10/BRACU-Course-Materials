class Person{
  String name;
  static int personCount=0;
  
  public Person(String nm){
    this.name = nm;
    Person.personCount++;
  }
  public void showDialogue(){
    System.out.println("My name is " +this.name+".");
  }  
  public void showPerson(){
    System.out.println("I am a Person");
  }
  
  @Override
  public String toString(){
    return "Name: "+this.name;
  }
  
}