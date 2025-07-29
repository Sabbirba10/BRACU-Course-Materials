package Lec12_08Apr.folder1;

public class Teacher {
    String name;
    Student[] students = new Student[50];

    Teacher(String name) {
        this.name = name;
    }

    void details() {
        System.out.println("Teacher name: "+this.name);
        System.out.println("Students:");
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            students[i].details();
        }
    }

    void updateGrade(int index, double updated) {
        this.students[index].cgpa = updated;
    }
}
