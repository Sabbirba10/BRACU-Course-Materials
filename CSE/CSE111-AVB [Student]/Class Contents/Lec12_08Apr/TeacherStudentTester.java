package Lec12_08Apr;

public class TeacherStudentTester {
    public static void main(String[] args) {
        Student s1 = new Student("Nafis", 3.65);
        Student s2 = new Student("Sharif", 3.7);
        System.out.println("1====================1");
        s1.details();
        s2.details();

        System.out.println("2====================2");
        Teacher t1 = new Teacher("Md. Shamim Mia");
        t1.details();

        System.out.println("3====================3");
        t1.students[0] = s2;
        t1.students[1] = s1;

        System.out.println("4====================4");
        t1.details();

        System.out.println("5====================5");
        t1.updateGrade(0, 3.8);
        
        System.out.println("6====================6");
        s2.details();
        t1.details();
    }
}
