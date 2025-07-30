//
//
//
//
//--TASK--04------------------------------
public class Student {
  
  public int id;
  public double cgpa = -1;
  public String [] courses;
  public int count = 0;
  public int limit;
  
  public Student (int a) {
    this.id = a;
    System.out.println("A student with ID "+this.id+" has been created. ");}

  public Student (int a, double b) {
    this.id = a;
    this.cgpa = b;
    if (cgpa<3) {
      limit = 3;}
    else {
      limit = 4;}
    courses = new String [limit];
    System.out.println("A student with ID "+this.id+" and cgpa "+this.cgpa+" has been created.");}
  
  public void storeCG (double a) {
    this.cgpa = a;
    if (cgpa<3) {
      limit = 3;}
    else {
      limit = 4;}
    courses = new String [limit];}
  
  public void addCourse (String a) {
    if (cgpa==-1) {
      System.out.println("Failed to add "+a);
      System.out.println("Set CG first");}
    else if (count == limit) {
      System.out.println("Failed to add "+a);
      if (limit == 3) {
        System.out.println("CG is low. Can't add more than 3 courses");}
      else if (limit == 4) {
        System.out.println("Maximum 4 courses allowed.");}}
    else {
      courses[count] = a;
      count = count+1;}}
  
  public void addCourse (String [] p) {
    for (int i = 0; i<p.length; i++) {
      String a = p[i];
      if (cgpa==-1) {
        System.out.println("Failed to add "+a);
        System.out.println("Set CG first");}
      else if (count == limit) {
        System.out.println("Failed to add "+a);
        if (limit == 3) {
          System.out.println("CG is low. Can't add more than 3 courses");}
        else if (limit == 4) {
          System.out.println("Maximum 4 courses allowed.");}}
      else {
        courses[count] = a;
        count = count+1;}}}
  
  public void showAdvisee () {
    System.out.println("Student ID: "+id+", CGPA: "+cgpa);
    if (count == 0) {
      System.out.println("No courses added.");}
    else {
      System.out.println("Added courses are: ");
      for (int i = 0; i<count; i++) {
        System.out.print(courses[i]+" ");}
      System.out.println();}}
  
  public void removeAllCourse () {
    count = 0;}
  
  public void storeID (int a) {
    this.id = a;}
}