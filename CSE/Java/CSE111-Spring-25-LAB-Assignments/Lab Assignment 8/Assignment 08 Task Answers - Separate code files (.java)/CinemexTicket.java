//
//
//
//
//--TASK--07--------------------------------------
public class CinemexTicket extends MovieTicket {
  public static int totalticket = 0;
  public String genre;
  public String status = "Not Paid";
  public String id;
  
  public CinemexTicket (String a, String b, String c, String d) {
    super(a,d,b,0.0);
    genre = c;
    seat = "Regular";
    totalticket = totalticket+1;
    id = getMovie()+"-"+seat.charAt(0)+"-"+totalticket;}
  
  public CinemexTicket (String a, String b, String c, String d, String e) {
    super(a,d,b,0.0);
    genre = c;
    seat = e;
    totalticket = totalticket+1;
    id = getMovie()+"-"+seat.charAt(0)+"-"+totalticket;}
  
  public void calculateTicketPrice () {
    int temp = -1;
    for (int i = 0; i<3; i++) {
      if (seatTypes[i].equals(seat)) {
        temp = i;}}
    setPrice(seatPrices[temp]);
    String [] hour = showtime.split(":");
    int timeint = Integer.parseInt(hour[0]);
    if(timeint>=18 && timeint<=23) {
      setPrice(getPrice()+(getPrice()*(nightShowCharge/100.0)));}
    System.out.println("Ticket price is calculated successfully.");}
  
  public static int getTotalTickets () {
    return totalticket;}
  
  public String toString() {
    return "Ticket ID: "+id+"\n"+super.toString()+"\nGenre: "+genre+"\nSeat Type: "+seat+"\nPrice(tk): "+getPrice()+"\nStatus: "+status;}
  
  public String confirmPayment () {
    if (status.equals("Paid")) {
      return "Ticket price is already paid!";}
    else {
      status = "Paid";
      return "Payment Successful.";}}
}