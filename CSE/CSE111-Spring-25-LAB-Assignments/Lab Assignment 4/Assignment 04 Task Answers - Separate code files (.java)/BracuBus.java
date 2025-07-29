//
//
//
//
//--TASK--07--BracuBus----------------------------
public class BracuBus {
  
  public String route;
  public int count = 0;
  public int limit;
  public String [] psn;
  public boolean pass = false;
  
  public BracuBus (String a, int b) {
    this.route = a;
    this.limit = b;
    psn = new String [limit];}
  
  public BracuBus (String a) {
    this.route = a;
    this.limit = 2;
    psn = new String [limit];}
  
  public void showDetails () {
    System.out.println("Bus Route: "+route);
    System.out.println("Passenger Count: "+count+" (Max: "+limit+")");
    System.out.println("Passengers on Board:");
    for(int i = 0; i<count; i++) {
      System.out.print(psn[i]+" ");}
    System.out.println();}
  
  public void board () {
    System.out.println("No passengers");}
  
  public void board (BracuStudent a, BracuStudent b) {
    if (a.pass == false) {
      System.out.println("You don't have a bus pass!");}
    else if (a.dest != this.route) {
      System.out.println("You got on the wrong bus!");}
    else if (this.count == this.limit) {
      System.out.println("Bus is full!");}
    else {
      this.psn[count] = a.name;
      this.count = this.count + 1;
      System.out.println(a.name+" boarded the bus.");}
    
    if (b.pass == false) {
      System.out.println("You don't have a bus pass!");}
    else if (b.dest != this.route) {
      System.out.println("You got on the wrong bus!");}
    else if (this.count == this.limit) {
      System.out.println("Bus is full!");}
    else {
      this.psn[count] = b.name;
      this.count = this.count + 1;
      System.out.println(b.name+" boarded the bus.");}}
  
  public void board (BracuStudent a) {
    if (a.pass == false) {
      System.out.println("You don't have a bus pass!");}
    else if (a.dest != this.route) {
      System.out.println("You got on the wrong bus!");}
    else if (this.count == this.limit) {
      System.out.println("Bus is full!");}
    else {
      this.psn[count] = a.name;
      this.count = this.count + 1;
      System.out.println(a.name+" boarded the bus.");}}
    
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  