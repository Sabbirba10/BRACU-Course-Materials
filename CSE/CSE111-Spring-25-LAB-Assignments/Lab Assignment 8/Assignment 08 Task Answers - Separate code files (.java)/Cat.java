//
//
//
//
//--TASK--03--Cat------------------------------------
public class Cat extends Animal {
  public String breed;
  
  public Cat (String a, int b, String c, String d) {
    super(a, b, c);
    breed = d;}
  
  public String info () {
    return super.info()+"Breed: "+breed;}
  
  public void makeSound () {
    System.out.println(color+" color "+name+" is meowing");}
  
}