//
//
//
//
//--TASK--05-------------------------------
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
  
  public void addSong (Song a) {
    if (start==null) {
      start = a;
      System.out.println(a.title+" added to "+name);}
    else {
      Song temp = start;
      while (true) {
        if (temp.next==null) {
          temp.next = a;
          System.out.println(a.title+" added to "+name);
          break;}
        temp = temp.next;}}}
  
  public void addSong (Song a, int b) {
    if (b==0) {
      Song temp = start;
      start = a;
      a.next = temp;
      System.out.println(a.title+" added to "+name);}
    else {
      Song temp = start;
      int count = 0;
      while (true) {
        if ((b-1)==count) {
          Song temp2 = temp.next;
          temp.next = a;
          a.next = temp2;
          System.out.println(a.title+" added to "+name);
          break;}
        if (temp.next==null) {
          System.out.println("Cannot add song to Index "+b);
          break;}
        temp = temp.next;
        count = count + 1;}}}
  
}