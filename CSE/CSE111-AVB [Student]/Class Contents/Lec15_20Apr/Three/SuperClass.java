package Lec15_20Apr.Three;

public class SuperClass {
    int variable;

    SuperClass(int a) {
        variable = a;
    }
}

class SubClass extends SuperClass {
    int variable;

    SubClass(int a) {
        super(a);
        
        // System.out.println(this.variable);
        // System.out.println(super.variable);
    }
}