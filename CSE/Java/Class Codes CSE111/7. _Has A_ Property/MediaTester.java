class MediaTester{  
  public static void main(String[] args){
    Video v1 = new Video("Cats","mp4",4.6);
    Video v2 = new Video("Dogs","mkv",3.2);
    Video v3 = new Video("Funny","mp4",2.5);
    MyMediaPlayer player = new MyMediaPlayer( 5 );
    System.out.println("==================");
    player.addVideo(v1);
    player.addVideo(v2);
    player.addVideo(v3);
    player.showPlaylist();
    System.out.println("==================");
    player.showCurrentlyPlaying();
    System.out.println("==================");
    player.playPrev();
    player.showCurrentlyPlaying();
    System.out.println("==================");
  } 
}