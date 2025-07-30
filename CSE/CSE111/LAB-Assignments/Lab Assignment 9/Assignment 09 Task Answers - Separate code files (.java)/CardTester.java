public class CardTester {
public static void main(String[] args) {
CreditCard card1 = new PlatinumCard("Ali", "345 127");
CreditCard card2 = new SignatureCard("Rahul", "514 123");
CreditCard card3 = new SignatureCard("Rohan", "147 965");
CreditCard [] cards = {card1, card2, card3};
for (int i = 0; i<cards.length; i++)
{
System.out.println("================");
if (cards[i] instanceof SignatureCard)
{
SignatureCard new_card = (SignatureCard) cards[i];
new_card.spendCash(500);
}
else if (cards[i] instanceof PlatinumCard)
{
PlatinumCard new_card = (PlatinumCard) cards[i];
new_card.spendCash(200);
}
System.out.println("================");
cards[i].cardDetails();
}
}
} 