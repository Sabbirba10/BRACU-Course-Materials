package Lec07_02Mar;

public class App {
    public String name;
    public double size = 10;
    public boolean run = true;

    public App() {}

    public App(String n, double s) {
        this.name = n;
        this.size = s;
        System.out.println("Print during creation phase");
    }

    public String info() {
        if(run) return this.name+"("+this.size+" MB) is running.";
        else return this.name+"("+this.size+" MB) is not running.";
    }

    public void run() {
        System.out.println(this.name + " Application is now running.");
    }

    public String isAppRunning() {
        if(run) return "Yes";
        else return "No";
    }

    public void close() {
        if(run) System.out.println(this.name + " Application is now closed.");
        else System.out.println(this.name + " is not open.");
    }
}