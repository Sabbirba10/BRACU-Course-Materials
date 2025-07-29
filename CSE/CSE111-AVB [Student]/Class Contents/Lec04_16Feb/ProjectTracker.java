package Lec04_16Feb;
import java.util.Arrays;

public class ProjectTracker {

    public static void main(String[] args) {
        // Project details
        String project1_title = "AI Chatbot";
        String project1_supervisor = "Dr. ABC";
        String[] project1_members = new String[] {"Alice", "Bob", "Charlie"};
        boolean project1_submitted = true;

        String project2_title = "Smart Traffic System";
        String project2_supervisor = "Prof. DE";
        String[] project2_members = {"David", "Emma"};
        boolean project2_submitted = false;

        String project3_title = "Blockchain Voting";
        String project3_supervisor = "Dr. FGHI";
        String[] project3_members = {"Frank", "Grace", "Henry", "Iris"};
        boolean project3_submitted = true;

        // Printing project details
        printProjectDetails(project1_title, project1_supervisor, project1_members, project1_submitted);
        printProjectDetails(project2_title, project2_supervisor, project2_members, project2_submitted);
        printProjectDetails(project3_title, project3_supervisor, project3_members, project3_submitted);

        project2_submitted = true;
        
        System.out.println(project2_title+ " Project has been submitted!");
        printProjectDetails(project2_title, project2_supervisor, project2_members, project2_submitted);

    }

    // Static method to print project details
    public static void printProjectDetails(String title, String supervisor, String[] members, boolean submitted) {
        System.out.println("--------------------------------------------------");
        System.out.println("Project Title: " + title);
        System.out.println("Supervisor: " + supervisor);
        System.out.println("Team Members: " + members + "\n" + Arrays.toString(members));
        System.out.println("Submitted?: " + submitted);
        System.out.println("--------------------------------------------------");
    }
}
