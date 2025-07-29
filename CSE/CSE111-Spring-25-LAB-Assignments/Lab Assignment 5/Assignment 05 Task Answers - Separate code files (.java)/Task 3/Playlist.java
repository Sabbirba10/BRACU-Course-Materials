//
//
//
//
//--TASK--03-------------------------------
public class Playlist {
  public String name;
  public Song start;
  
  public Playlist (String a) {
    name = a;
    System.out.println(a+" Playlist created.");}
  
  public void info () {
    System.out.println(name+" has the following songs:");
    if (start==null) {
      System.out.println("No songs in "+name+".");}
    else {
      Song temp = start;
      int count = 1;
      while (true) {
        System.out.println("Song-"+count);
        System.out.println("Title: "+temp.title+", Artist: "+temp.artist);
        System.out.println("Length: "+temp.length+" minutes");
        temp = temp.next;
        count = count + 1;
        if (temp==null) {
          break;}}}}

}