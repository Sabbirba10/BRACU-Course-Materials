class MyTube{
  Video[] vArr = new Video[10];
  int lastVid = 0, currVid = -1;
  
  public MyTube(){
    System.out.println("Welcome to MyTube");
  }
  
  public void goPrev(){
    if( currVid == -1 ) System.out.println("No Videos");
    else currVid-=1;
  }
  public void goNext(){
    if( currVid == vArr.length ) System.out.println("No Videos");
    else currVid+=1;
  }
  
  public void nowPlaying(){
    if ( this.currVid==-1 ){
      System.out.println( "There are no videos" );
    } else {
      Video v = vArr[currVid];
      System.out.println( "Now Playing... "+v.getVideo() );
    }
  }
  public void addVideo( Video v ){
    if( lastVid==vArr.length ){
      System.out.println("No More capacity");
    } else {
      vArr[ lastVid ] = v;
      lastVid++;
    }
    currVid = lastVid-1;
  }
  public void addVideo( Video[] vids ){
    for( int i=0; i<vids.length; i++ ){
      Video vid = vids[i];
      this.addVideo( vid );
    }
  }
  
}