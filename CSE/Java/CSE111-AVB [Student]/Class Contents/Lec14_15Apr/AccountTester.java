package Lec14_15Apr;

public class AccountTester {
 public static void main(String[] args) {
  Account a1 = new Account("X");
  a1.deposit(1000);
  System.out.println(a1.getBalance());// 1000
  System.out.println(a1.totalBalance);// 1000
  System.out.println(Account.count); // 1
  Account a2 = new Account("Y");
  a2.deposit(2000);
  System.out.println(a2.getBalance());// 2000
  System.out.println(Account.count);// 2
  System.out.println(a2.totalBalance);// 3000
  
  a2.report();
 }

}