public class Tester5 {
public static void main(String[] args) {
Cricket_Tournament ct1 = new Cricket_Tournament();
System.out.println(ct1.detail());
System.out.println("-----------------------");
Cricket_Tournament ct2 = new Cricket_Tournament("IPL", 10,
"t20");
System.out.println(ct2.detail());
System.out.println("-----------------------");
Tennis_Tournament tt = new Tennis_Tournament("Roland Garros", 128);
System.out.println(tt.detail());
}
} 