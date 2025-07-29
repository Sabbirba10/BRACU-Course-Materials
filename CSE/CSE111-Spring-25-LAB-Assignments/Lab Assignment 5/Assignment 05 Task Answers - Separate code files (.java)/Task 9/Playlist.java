//
//
//
//
//--TASK--09-------------------------------
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
  
  public void playSong (String a) {
    if (start==null) {
      System.out.println("No songs in "+name+".");}
    else {
      Song temp = start;
      while (true) {
        if (temp.title.equals(a)) {
          System.out.println("Playing "+temp.title+" by "+temp.artist);
          break;}
        temp = temp.next;
        if (temp==null) {
          System.out.println(a+" not found in "+name);
          break;}}}}
  
  public void playSong (int a) {
    if (start==null) {
      System.out.println("No songs in "+name+".");}
    else {
      Song temp = start;
      int count = 0;
      while (true) {
        if (count==a) {
          System.out.println("Playing "+temp.title+" by "+temp.artist);
          break;}
        temp = temp.next;
        count = count + 1;
        if (temp==null) {
          System.out.println("Song at Index "+a+" not found in "+name);
          break;}}}}
  
  public void deleteSong (String a) {
    if (start==null) {
      System.out.println("No songs in "+name+".");}
    else {
      Song temp = start;
      Song prev = null;
      while (true) {
        if (temp.title.equals(a)) {
          if (temp==start) {
            start = start.next;
            System.out.println(a+" deleted from "+name+".");
            break;}
          else {
            prev.next = temp.next;
            System.out.println(a+" deleted from "+name+".");
            break;}}
        prev = temp;
        temp = temp.next;
        if (temp==null) {
          System.out.println(a+" not found in "+name);
          break;}}}}
  
  public int totalSong () {
    if (start==null) {
      return 0;}
    else {
      Song temp = start;
      int count = 0;
      while (true) {
        temp = temp.next;
        count = count + 1;
        if (temp==null) {
          break;}}
      return count;}}
  
}