//
//
//
//
//--TASK--08--KKFlavouredTea------------------------------------
public class KKFlavouredTea extends KKTea {
  
  public KKFlavouredTea (String a, int b, int c) {
    super(b, c);
    name = "KK "+ a +" Tea";}
  
  public static void updateSoldStatusFlavoured (KKFlavouredTea a) {
    a.status = true;
    kkfcount = kkfcount+1;
    count = count+1;}
}