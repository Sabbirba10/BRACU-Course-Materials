//--TASK--01----------------------------------------
public class BankAccount {
  public int AccountNo = 0;
  public String Type = "Not Set";
  
  public String printDetails () {
    String a = "Account No: "+AccountNo+"\nType: "+Type;
    return a;}
  
  public void setInfo (int a, String b) {
    this.AccountNo = a;
    this.Type = b;
    System.out.println("Account information updated!");}
}