//
//
//
//
//--TASK--06--Manager------------------------------------
public class Manager extends Employee {
  public double bonus;
  public double finalsalary;
  
  public Manager (String a, double b, int c, double d) {
    super(a, b, c);
    bonus = d;}
  
  public void calculateSalary () {
    if (getHoursWorked()>40) {
      finalsalary = getBaseSalary() + (getBaseSalary() * (bonus/100.0));}
    else {
      finalsalary = getBaseSalary();}}
  
  public void displayInfo () {
    super.displayInfo();
    System.out.println("Bonus: " + bonus + " %");
    System.out.println("Final Salary: $" + finalsalary);}
  
  public void requestIncrement (int a) {
    if (getHoursWorked()>100) {
      double b = getBaseSalary() + a;
      setBaseSalary(b);
      System.out.println("$"+a+" Increment approved.");}
    else if (getHoursWorked()>80) {
      double b = getBaseSalary() + (a/2);
      setBaseSalary(b);
      System.out.println("$"+(a/2)+" Increment approved.");}
    else {
      System.out.println("Increment denied.");}}
  
}