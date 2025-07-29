package Lec04_16Feb;

public class ProjectTrackerOOP {
    public static void main(String[] args) {
        // Creating project objects
        Project project1 = new Project();
        // project1[0] = 4;  similar concept
        // project1[1] = 6;
        // project1[2] = 1;
        // project1[3] = 2;
        project1.title = "AI Chatbot";
        project1.supervisor = "Dr. Smith";
        project1.teamMembers = new String[]{"Alice", "Bob", "Charlie"};
        project1.submitted = true;
        System.out.println("Project1: "+project1);

        Project project2 = new Project();
        project2.title = "Smart Traffic System";
        project2.supervisor = "Prof. Johnson";
        project2.teamMembers = new String[]{"David", "Emma"};
        project2.submitted = false;
        System.out.println("Project2: "+project2);

        Project project3 = new Project();
        project3.title = "Blockchain Voting";
        project3.supervisor = "Dr. Williams";
        project3.teamMembers = new String[]{"Frank", "Grace", "Henry", "Ivy"};
        project3.submitted = true;
        System.out.println("Project3: "+project3);

        // Printing project details using the non-static method
        project1.printDetails();
        project2.printDetails();
        project3.printDetails();

        project2.submit();
        project2.printDetails();

        project1.submit();
        project1.printDetails();
    }
}
