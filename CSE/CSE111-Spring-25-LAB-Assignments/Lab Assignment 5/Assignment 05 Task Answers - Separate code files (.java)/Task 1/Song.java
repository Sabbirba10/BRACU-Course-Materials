//
//
//
//
//--TASK--01-------------------------------
public class Song {
  public String title;
  public String artist;
  public int length;
  public Song next;
  
  public Song (String a, String b, int c) {
    title = a;
    artist = b;
    length = c;}
  
  public void songInfo () {
    System.out.println("Title: "+title+", Artist: "+artist);
    System.out.println("Length: "+length+" minutes");}
  
}