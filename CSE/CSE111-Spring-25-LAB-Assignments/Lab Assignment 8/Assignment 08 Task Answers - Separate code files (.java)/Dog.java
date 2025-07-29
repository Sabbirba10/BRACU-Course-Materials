//
//
//
//
//--TASK--03--Dog------------------------------------
public class Dog extends Animal {
  public String breed;
  
  public Dog (String a, int b, String c, String d) {
    super(a, b, c);
    breed = d;}
  
  public String info () {
    return super.info()+"Breed: "+breed;}
  
  public void makeSound () {
    System.out.println(color+" color "+name+" is barking");}
  
}