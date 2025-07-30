class Garage{
  
  Car[] cArr = new Car[4];
  int count;
  
  public Garage(){
    System.out.println("Welcome to the Garage....");
  }
  public void storeCar( Car c ){
    this.cArr[ count ] = c;
    count++;
  }
  public void showGarage(){
    if (count==0) System.out.println("No cars in Garage!");
    else {
      System.out.println(count+" cars in Garage!\n");
      for( int i=0; i<this.cArr.length; i++){
        if (cArr[i]!=null){
          cArr[i].showCar( );
          System.out.println("+++++++++++");
        }
        
      }
    }
  }
  
}