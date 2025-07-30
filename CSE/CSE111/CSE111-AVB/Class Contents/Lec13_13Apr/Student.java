package Lec13_13Apr;

public class Student {
    public String ID;
    public String name;
    public static int totalCount;

    public void register() {
        Student.totalCount++;
    }
}
