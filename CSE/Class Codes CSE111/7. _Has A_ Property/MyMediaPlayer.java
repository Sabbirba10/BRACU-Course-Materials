class MyMediaPlayer{
  Video[] videos;
  int c;
  int currentPlay;
  public MyMediaPlayer( int n ){
    System.out.println("Welcome to MyMediaPlayer");
    this.videos = new Video[5];
    System.out.println("Can add "+n+" videos");
  }
  public void addVideo( Video v ){
    currentPlay=c;
    this.videos[ c++ ] = v;
  }
  public void playNext(){
    currentPlay++;
  }
  public void playPrev(){
    currentPlay--;
  }
  public void showCurrentlyPlaying(){
    Video v = this.videos[ currentPlay ];
    System.out.println("Currently Playing: "+v.title+"."+v.fT);
  }
  public void showPlaylist(){
    for(int i=0; i<videos.length; i++){
      Video v = videos[i];
      if (v==null) System.out.println("No Video");
      else System.out.println( v.returnInfo() );
      System.out.println("----");
    }
  }
  
  
}