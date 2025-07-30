class Video{
  String title = "Untitled Video";
  String fT;
  double dur;
  
  public Video( String t, String f, double d ){
    this.title = t;
    this.fT = f;
    this.dur = d;
  }
  public Video( String t ){
    this.title = t;
  }
  public Video(){
  }
  
  public String returnInfo(){
    String s = "Title: "+this.title+"."+this.fT+"\n";
    s += "Duration: "+this.dur+" mins";
    return s;
  }
  
}