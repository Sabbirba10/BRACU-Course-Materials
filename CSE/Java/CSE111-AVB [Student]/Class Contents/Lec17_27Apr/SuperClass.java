package Lec17_27Apr;

public class SuperClass {
    int v0, v1;
    SuperClass(int a) {
        v0 = a; v1 = a+10;
        System.out.println("Super Constructor");
    }
    String show() {
        String s1 = "this.v0: "+this.v0;
        s1 += "\nthis.v1: "+this.v1;
        return s1;
    }
    int methodA(){ return v0+v1; }
}

class SubClass extends SuperClass {
    int v1, v2;

    SubClass(int a) {
        super(a+5); v1 = a; v2 = a+20;
        System.out.println("SubClass Constructor");
    }

    String show() {
        String s2 = "this.v0: "+this.v0;
        s2+= "\nthis.v1: "+this.v1;
        s2+= "\nsuper.v1: "+super.v1;
        s2+= "\nthis.v2: "+this.v2;

        return "super.show():\n"+super.show()+"\nthis.show():\n"+s2;
    }

    
    int methodA(){ return v0+v1+super.v1+v2; }
}