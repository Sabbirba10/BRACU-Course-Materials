//
//
//
//
//--TASK--07----------------------------------------
public class CellPhone {
  public String model = "unknown";
  public int tracker;
  public String [] contacts = new String [3];
  
  public void printDetails  () {
    System.out.println("Phone Model "+model);
    System.out.println("Contacts Stored "+tracker);
    for (int i = 0; i<tracker; i++) {
      if (i==0) {
        System.out.println("Stored Contacts:");}
      System.out.println(contacts[i]);}}
  
  public void storeContact (String a) {
    if (tracker<3) {
      contacts[tracker] = a;
      tracker = tracker+1;
      System.out.println("Contacts Stored");}
    else {
      System.out.println("Memory full. New contact can't be stored. ");}}
}