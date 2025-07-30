class Student{
public String name;
public int id;
public String courses = "";
public Student(String n, int i){
name = n;
id = i;
}
public void info(){
System.out.println("Name: "+name);
System.out.println("ID: "+id);
System.out.println("Courses: "+courses);
}
} 