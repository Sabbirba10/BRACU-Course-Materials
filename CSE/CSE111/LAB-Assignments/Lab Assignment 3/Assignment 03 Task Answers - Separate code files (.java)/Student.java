//
//
//
//
//--TASK--04----------------------------------------
public class Student {
  public String Name = "Not Set";
  public String Department = "CSE";
  public double CGPA = 0.0;
  public int Credits = 9;
  public String ScholarshipStatus = "Not Set";
  
  public void showDetails () {
    System.out.println("Name: "+Name);
    System.out.println("Department: "+Department);
    System.out.println("CGPA: "+CGPA);
    System.out.println("Credits: "+Credits);
    System.out.println("Scholarship Status: "+ScholarshipStatus);}
  
  public void updateDetails (String a, double b, int c) {
    this.Name = a;
    this.CGPA = b;
    this.Credits = c;}
  
  public void updateDetails (String a, double b) {
    this.Name = a;
    this.CGPA = b;}
  
  public void updateDetails (String a, double b, int c, String d) {
    this.Name = a;
    this.CGPA = b;
    this.Credits = c;
    this.Department = d;}
  
  public void checkScholarshipEligibility () {
    if (Credits>10) {
      if (CGPA >=3.7) {
        this.ScholarshipStatus = "Merit based scholarship";
        System.out.println(Name+" is eligible for "+ScholarshipStatus);}
      else if (CGPA>=3.5) {
        this.ScholarshipStatus = "Need-based scholarship";
        System.out.println(Name+" is eligible for "+ScholarshipStatus);}
      else {
        this.ScholarshipStatus = "No scholarship";
        System.out.println(Name+" is not eligible for Scholarship");}}
    else {
      this.ScholarshipStatus = "No scholarship";
      System.out.println(Name+" is not eligible for Scholarship");}}
}