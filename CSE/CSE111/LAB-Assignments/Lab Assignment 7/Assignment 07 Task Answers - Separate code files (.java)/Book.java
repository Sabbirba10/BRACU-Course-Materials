//
//
//
//
//---TASK--06--Book-------------------------------
public class Book extends Product {
  public String isbn;
  public String pub;
  
  public Book (int a, String b, int c, String d, String e) {
    super (a, b, c);
    isbn = d;
    pub = e;}
  
  public String printDetail () {
    return getIdTitlePrice()+" ISBN: "+isbn+" Publisher: "+pub;}
  
}