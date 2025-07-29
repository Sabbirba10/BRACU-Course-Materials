class BankAcc{
  private String name, dob;
  private int age;
  private double balance;
  
  public BankAcc(String n, String d, int a){
    this.name=n;
    this.dob=d;
    this.age=a;
  }
  //Setters
  public void setName(String n){
    this.name = n;
  }
  public void setAge(int a){
    this.age = a;
  }
  public void setDob(String d){
    this.dob = d;
  }
  //Getters
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getDob(){
    return this.dob;
  }
  public double getBalance(){
    return this.balance;
  }
  
  private boolean checkPasswd(String p){
    if( p.equals( "KothinPassword" ) )
      return true;
    else
      return false;
  }
  
  public void addMoney( double amnt, String passwd ){
    if ( checkPasswd(passwd) )
      this.balance += amnt;
    else
      System.out.println("Wrong Password!");
  }
  
  public void cashOut( double amnt ){
    if( balance-amnt<0 )
      System.out.println("Not enough balance");
    else{
      this.balance -= amnt;
      System.out.println("Cash Out: "+amnt);
      System.out.println("Current Balance: "+this.balance);
    }
  }
  
  public void printDetails(){
    System.out.println("Name: "+this.name);
    System.out.println("DOB: "+this.dob);
    System.out.println("Age: "+this.age);
    System.out.println("Balance: "+this.balance);
  }

}