package Lec08_04Mar;

public class Tester2 {
 public static void main(String[] args) {
  Programmer joy = new Programmer("Joy", "Junior Software Engineer", 50000);
  System.out.println("1====================");
  joy.setSkill("c++", "java");
  joy.setSkill("c#", "python");
  joy.showInfo();
  System.out.println("2====================");
  Programmer anik = new Programmer("Anik", "Software Engineer", 60000);
  System.out.println("3====================");
  anik.setSkill("c++", "java", "python");
  anik.setSkill("c#", "ruby", "swift");
  anik.showInfo();
  System.out.println("4====================");
  Programmer luna = new Programmer("Luna", "Senior Software Engineer");
  luna.setSkill("c++", "java", "ruby");
  luna.showInfo();
  System.out.println("5====================");
  luna.setSalary(70000);
  System.out.println("6====================");
  luna.showInfo();
 }
}
