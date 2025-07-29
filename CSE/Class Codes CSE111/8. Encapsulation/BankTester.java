class BankTester{  
  public static void main(String[] args){
    BankAcc acc = new BankAcc("Rahim","27/8/1998",26);
    
    acc.addMoney(20,"KothinPassword");
    
    System.out.println( acc.getBalance() );

  }
}