package Lec14_15Apr;

public class Tracing {
    public static int x= 0, y = 0;
    public int a, b;
    public Tracing(int a, int b){
        this.a = a;
        this.b = b;
        x+=1;
        y+=2;
    }
    public void methodA(int a){
        this.a = x+a;
        this.b = this.b+ this.a +this.methodB();
        System.out.println(this.a+" "+this.b+" "+x);
    }
    public int methodB(){
        this.b = y - this.b + this.a;
        System.out.println(this.a+" "+this.b+" "+x);
        x += this.b;
        return this.b;
    }
    public void methodB(Tracing t1){
        t1.b = this.y - t1.b + this.b;
        System.out.println(t1.a+" "+t1.b+" "+x);
    }
}

