//
//
//
//
//--TASK--01------------------------------
public class Student {
  
  public String name;
  public String prog;
  
  public Student (String a, String b) {
    this.name = a;
    this.prog = b;}
  
  public void updateName (String a) {
    this.name = a;}
  
  public void updateProgram (String a) {
    this.prog = a;}
  
  public String accessProgram () {
    return this.prog;}
  
}