package Lec14_15Apr;


public class Test9{
    public static void main(String [] args){
        Tracing t1= new Tracing(2, 3);
        t1.methodA(1);
        Tracing t2= new Tracing(3, 4);
        // t2.methodA(2);
        t1.methodB(t2);
        // t2.methodB(t2);
    }
}

