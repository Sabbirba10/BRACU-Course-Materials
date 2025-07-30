class Video{
  
  private String title;
  
  static int vidCount; //static variable
  
  Video nextVid;
  Video prevVid;
  
  public Video(String t){
    this.title = t;
    this.vidCount++;
  }
  
  //static method
  public static void showVidCount( Video v ){
    Video vTemp = new Video("Hello.mp4");
    System.out.println( vTemp.title+" & "+v.title );
    System.out.println( Video.vidCount );
  }
  
  public String getVideo(){
    return this.title;
  }
  
}