package Lec14_15Apr;

public class Account{
 String name;
 int balance = 0;
 private static Account[] accounts = new Account[5];
 static int count;
 static int totalBalance;


 Account(String s) {
  name = s;
  accounts[count] = this;
  count++;
 }
 void deposit(int m) {
  balance += m;
  totalBalance += m;
 }
 int getBalance(){
  return balance;
 }

 static void report(){
  for (int i = 0; i < Account.count; i++) {
   Account a = Account.accounts[i];
   System.out.println(a.name);
  }
 }
}