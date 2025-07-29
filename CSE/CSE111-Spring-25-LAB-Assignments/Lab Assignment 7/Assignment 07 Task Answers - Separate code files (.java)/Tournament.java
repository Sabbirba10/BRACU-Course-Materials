public class Tournament {
private String name;
public Tournament() {
this.name = "Default";
}
public Tournament(String name) {
this.name = name;
}
public void setName(String name){
this.name = name;
}
public String getName(){
return this.name;
}
} 