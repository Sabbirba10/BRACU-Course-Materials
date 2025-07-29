//
//
//
//
//--TASK--08--KKTea------------------------------------
public class KKTea extends Tea {
  public static int count = 0;
  public static int kktcount = 0;
  public static int kkfcount = 0;
  public int bag;
  public int weight;
  
  public KKTea (int a, int b) {
    super(null,a);
    name = "KK Regular Tea";
    bag = b;
    weight = bag*2;}
  
  public void productDetail () {
    super.productDetail();
    System.out.println("Weight: "+ weight +", Tea Bags: "+ bag);}
  
  public static void totalSales () {
    System.out.println("Total Sales: "+ count);
    System.out.println("KK Regular Tea: "+ kktcount);
    if (kkfcount>0) {
      System.out.println("KK Flavoured Tea: "+ kkfcount);}}
  
  public static void updateSoldStatusRegular (KKTea a) {
    a.status = true;
    kktcount = kktcount+1;
    count = count+1;}
}