//
//
//
//
//--TASK--06--Developer------------------------------------
public class Developer extends Employee {
  public String lang;
  public double finalsalary;
  
  public Developer (String a, double b, int c, String d) {
    super(a, b, c);
    lang = d;}
  
  public void calculateSalary () {
    if (lang.equals("Java")) {
      finalsalary = getBaseSalary() + 700;}
    else {
      finalsalary = getBaseSalary();}}
  
  public void displayInfo () {
    super.displayInfo();
    System.out.println("Language: " + lang);
    System.out.println("Final Salary: $" + finalsalary);}
  
}