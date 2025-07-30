package Lec16_22Apr.Three;

public class SuperClass {
    int variable;

    SuperClass(int a) {
        System.out.println("Superclass const");
        variable = a;
    }

    void method(int p) { 
        variable = p; 
        System.out.println("Superclass method");
        System.out.println(variable);
    }
}

class SubClass extends SuperClass {
    int variable;

    SubClass(int a) {
        super(a);
        System.out.println("Subclass const");
    }

    void method(int v){ 
        variable = v; 
        System.out.println("Subclass method");
        // super.variable = v+10;
        super.method(v+10);
        System.out.println("Subclass method");
        System.out.println(variable);
    }
}