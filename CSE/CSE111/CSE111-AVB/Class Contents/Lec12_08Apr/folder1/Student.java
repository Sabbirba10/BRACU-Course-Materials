package Lec12_08Apr.folder1;

public class Student {
    String name;
    double cgpa;

    Student(String a, double b) {
        this.name = a;
        this.cgpa = b;
    }

    void details() {
        System.out.println("Name: "+this.name+", CGPA: "+this.cgpa);
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}
