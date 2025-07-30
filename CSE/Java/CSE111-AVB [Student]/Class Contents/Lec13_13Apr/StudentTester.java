package Lec13_13Apr;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Asif";
        s1.ID = "4321";
        s1.register();

        System.out.println(s1.totalCount);

        Student s2 = new Student();
        s2.name = "Arif";
        s2.ID = "5221";
        s2.register();

        System.out.println(s2.totalCount);
        System.out.println(Student.totalCount);
    }
}
