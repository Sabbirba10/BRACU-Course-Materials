//
//
//
//
//--TASK--06----------------------------------------
public class TaxiLagbe {
  public String Taxinumber;
  public String area;
  public int TotalPassenger;
  public String [] PassengerLists = new String [4];
  public int Totalcollectedfare;
  
  public void storeInfo (String a, String b) {
    this.Taxinumber = a;
    this.area = b;}
  
  public void printDetails () {
    System.out.println("Taxi number: "+Taxinumber);
    System.out.println("This taxi can cover "+area+" area");
    System.out.println("Total Passenger: "+TotalPassenger);
    System.out.println("Passenger Lists: ");
    for (int i = 0; i<TotalPassenger; i++) {
      System.out.print(this.PassengerLists[i]+" ");}
    System.out.println();
    System.out.println("Total collected fare: "+Totalcollectedfare+" Taka");}
  
  public void addPassenger (String a, int b) {
    if (TotalPassenger<4) {
      this.PassengerLists[TotalPassenger] = a;
      this.Totalcollectedfare = this.Totalcollectedfare + b;
      this.TotalPassenger = this.TotalPassenger+1;
      System.out.println("Dear "+a+"! Welcome to TaxiLagbe");}
    else {
      System.out.println("Taxi Full! No more passengers can be added");}}
  
  public void addPassenger (String a, int b, String c, int d) {
    if (TotalPassenger<4) {
      this.PassengerLists[TotalPassenger] = a;
      this.Totalcollectedfare = this.Totalcollectedfare + b;
      this.TotalPassenger = this.TotalPassenger+1;
      System.out.println("Dear "+a+"! Welcome to TaxiLagbe");}
    else {
      System.out.println("Taxi Full! No more passengers can be added");}
    if (TotalPassenger<4) {
      this.PassengerLists[TotalPassenger] = c;
      this.Totalcollectedfare = this.Totalcollectedfare + d;
      this.TotalPassenger = this.TotalPassenger+1;
      System.out.println("Dear "+c+"! Welcome to TaxiLagbe");}
    else {
      System.out.println("Taxi Full! No more passengers can be added");}}
}