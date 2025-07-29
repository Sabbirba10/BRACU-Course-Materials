//
//
//
//
//--TASK--08----------------------------------------
public class Employee {
  public String name;
  public double salary = 30000;
  public String designation = "junior";
  
  public void newEmployee (String a) {
    this.name = a;}
  
  public void displayInfo () {
    System.out.println("Employee Name: "+name);
    System.out.printf("Employee Salary: %.1f Tk%n",salary);
    System.out.println("Employee Designation: "+designation);}
  
  public void calculateTax () {
    if (salary>50000) {
      System.out.printf(this.name+" Tax Amount: %.2f Tk%n",(salary * 0.3));}
    else if (salary>30000) {
      System.out.printf(this.name+" Tax Amount: %.2f Tk%n",(salary * 0.1));}
    else {
      System.out.println("No need to pay tax");}}
  
  public void promoteEmployee (String a) {
    if (a.equals("senior")) {
      this.designation = "senior";
      this.salary = this.salary+25000;
      System.out.println(this.name+" has been promoted to senior");
      System.out.printf("New Salary: %.2f Tk%n",salary);}
    else if (a.equals("lead")) {
      this.designation = "lead";
      this.salary = this.salary+50000;
      System.out.println(this.name+" has been promoted to lead");
      System.out.printf("New Salary: %.2f Tk%n",salary);}
    else if (a.equals("manager")) {
      this.designation = "manager";
      this.salary = this.salary+75000;
      System.out.println(this.name+" has been promoted to manager");
      System.out.printf("New Salary: %.2f Tk%n",salary);}}
}