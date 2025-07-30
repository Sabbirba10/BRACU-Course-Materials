package Lec11_06Apr;

class Teacher {
    String name;
    private String initial;
    String[] courseNames = new String[3];
    int count;

    Teacher (String a, String b) {
        name = a;
        initial = b;
        System.out.println("A new teacher has been created");
    }

    
    void addCourse(Course object) {
        this.courseNames[this.count] = object.courseCode;
        this.count++;
    }

    String getInitial() {
        return initial;
    }
    void setInitial(String initial) {
        if (true) {
            System.out.println("you cannot update initial");
        } else {
            this.initial = initial;
        }
        
    }

    void printDetail() {
        System.out.println("Name: "+this.name+"\nInitial: "+this.initial+"\nList of courses:");
        for (int i = 0; i < count; i++) {
            System.out.println(this.courseNames[i]);
        }
    }
}

class Course {
    String courseCode;

    Course (String a) {
        courseCode = a;
    }
}