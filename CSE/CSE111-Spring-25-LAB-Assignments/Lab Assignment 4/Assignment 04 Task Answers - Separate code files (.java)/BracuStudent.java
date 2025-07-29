//
//
//
//
//--TASK--07--BracuStudent----------------------------
public class BracuStudent {
  
  public String name;
  public String dest;
  public boolean pass = false;
  
  public BracuStudent (String a, String b) {
    this.name = a;
    this.dest = b;}
  
  public void getPass () {
    this.pass = true;}
  
  public void updateHome (String a) {
    this.dest = a;}
  
  public void showDetails () {
    System.out.println("Student Name: "+this.name);
    System.out.println("Lives in "+this.dest);
    System.out.println("Have Bus Pass? "+this.pass);}
}