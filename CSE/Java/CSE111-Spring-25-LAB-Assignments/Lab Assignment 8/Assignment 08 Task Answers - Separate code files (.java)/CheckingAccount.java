//
//
//
//
//--TASK--02--------------------------------------
public class CheckingAccount extends Account {
  public static int count = 0;
  
  public CheckingAccount () {
    super(0.0);
    count = count + 1;}
  
  public CheckingAccount (double a) {
    super(a);
    count = count + 1;}
}