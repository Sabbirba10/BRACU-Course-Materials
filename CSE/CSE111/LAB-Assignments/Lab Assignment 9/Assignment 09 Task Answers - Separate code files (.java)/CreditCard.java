public class CreditCard {
public String cardHolder;
public String accountNo;
public int rewardPoints;
public CreditCard(String cardHolder, String accountNo, int rewardPoints){
this.cardHolder = cardHolder;
this.accountNo = accountNo;
this.rewardPoints = rewardPoints;
}
public void cardDetails(){
System.out.println("Card Holder Name: " + cardHolder);
System.out.println("Account Number: " + accountNo);
System.out.println("Reward point gained: " + rewardPoints);
}
}