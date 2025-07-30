//
//
//
//
//---TASK--06--CD-------------------------------
public class CD extends Product {
  public int dur;
  public String band;
  public String gen;
  
  public CD (int a, String b, int c, String d, int e, String f) {
    super (a, b, c);
    band = d;
    dur = e;
    gen = f;}
  
  public String printDetail () {
    return getIdTitlePrice()+" Band: "+band+" Duration: "+dur+" minutes Genre: "+gen;}
  
}