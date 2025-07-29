class PersonTester{

  public static void deathAnimation( Person p ){
    if( p instanceof Hero ){
      System.out.println("Game Over... "+p.name);
    } else if( p instanceof Boss ){
      System.out.println(p.name+": See you in hell..... ");
    } else if (p instanceof Person){
      System.out.println(p.name+" has died..");
    }else {
      System.out.println("Unknown Object Error!!!");
    }
  }

  
  public static void main(String[] args){
    
    Person p = new Person("RegularPerson");
    Hero h = new Hero( "Wolverine", "Regeneration" );
    Boss b1 = new Boss( "Adani", "Load Shedding" );
    Boss b2 = new Boss( "Adani", "Load Shedding" );
//    Person ph = (Person)h;
//    Hero hx = (Hero)ph;
//    System.out.println(p);
//    System.out.println(h);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println( b1.equals( b2 ) );
    
//    
//    deathAnimation( p );
//    deathAnimation( h );
//    deathAnimation( b );
    
    
//    Hero phh = (Hero)ph;
    
//    System.out.println( h instanceof Person );
//    System.out.println( b instanceof Boss );
//    Person ph = (Person)h;
//    Person pb = (Person)b;
//    deathAnimation( ph );
//    deathAnimation( pb );
    
    
    
    
  }
}