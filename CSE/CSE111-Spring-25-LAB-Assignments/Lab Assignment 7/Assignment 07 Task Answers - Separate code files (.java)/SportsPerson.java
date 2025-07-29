class SportsPerson {
private String team;
private String name;
public String role;
public double earningPerMatch;
public SportsPerson(String teamName, String name, String role){
this.team = teamName;
this.name = name;
this.role = role;
this.earningPerMatch = 0;
}
public String getNameTeam() {
return "Name: " + name + ", Team Name: " + team;
}
} 