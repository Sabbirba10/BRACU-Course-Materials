//
//
//
//
//--Task-04--SignatureCard----------------------------------
public class SignatureCard extends CreditCard {
  public SignatureCard (String a, String b) {
    super(a, b, 200);}
  
  public void spendCash (int a) {
    System.out.println("Previous Reward Points: "+rewardPoints);
    rewardPoints = rewardPoints + ((a/100)*4);
    System.out.println("Reward points after spending "+a+" taka: "+rewardPoints);}
  
  public void cardDetails () {
    super.cardDetails();
    System.out.println("Possible Number of Companions for Lounge: 5");}
}