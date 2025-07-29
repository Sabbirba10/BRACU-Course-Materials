package Lec08_04Mar;

public class Programmer {
 public String name;
 public String job;
 public double salary;
 public String skills;

 public Programmer(String n, String j, double s) {
  this.name = n;
  this.job = j;
  this.salary = s;
  System.out.println("Programmer created successfully.");
 }

 public void setSkill(String s1, String s2) {
  if (this.skills != null) {
   this.skills += "," + s1 + "," + s2;
  } else {
   this.skills = s1 + "," + s2;
  }
 }

 public void setSkill(String s1, String s2, String s3) {
  if (this.skills != null) {
   this.skills += "," + s1 + "," + s2 + "," + s3;
  } else {
   this.skills = s1 + "," + s2 + "," + s3;
  }
 }

 public void showInfo() {
  System.out.println("Name: " + this.name);
  System.out.println("Designation: " + this.job);
  if (this.salary > 0) {
   System.out.println("Salary: " + this.salary);
  } else {
   System.out.println("Salary: Pending for HR approval");
  }
  System.out.println("Skills: " + this.skills);
 }

 public Programmer(String name, String job) {
  // this(name, job, 0.0);
  this.name = name;
  this.job = job;
  System.out.println("Programmer created successfully.");
 }

 public void setSalary(double s) {
  this.salary = s;
 }

}