public class B extends A{
  int a = 25;
  public B(String n){
    super(n);
    System.out.println("Constructor: B");
  }
  public void show(){
    System.out.println( super.a );
    System.out.println("This is a method from Class B."); 
  }
  
}