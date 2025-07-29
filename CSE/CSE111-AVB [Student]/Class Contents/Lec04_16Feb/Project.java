package Lec04_16Feb;

import java.util.Arrays;

// Project class to hold project details
public class Project {
    // properties, fields, attributes, instance variable
    public String title;
    public String supervisor;
    public String[] teamMembers;
    public boolean submitted;

    // Non-static method to print project details
    public void printDetails() {
        System.out.println("--------------------------------------------------");
        String title = this.title+" - "+this.supervisor;
        // System.out.println("Project Title: " + this.title);
        // System.out.println("Supervisor: " + this.supervisor);
        System.out.println("Project Title: " + title);
        System.out.println("Team Members: " + this.teamMembers + "\n" + Arrays.toString(this.teamMembers));
        System.out.println("Submitted?: " + this.submitted);
        System.out.println("--------------------------------------------------");
    }

    public void submit(){
        if (this.submitted) {
            System.out.println("Cannot resubmit project.");
        } else {
            System.out.println("✅ Submission Complete for "+ this.title + " Project!");
            this.submitted = true;
        }
    }
    
}