public class CustomerServiceTester {
public static void main(String[] args) {
CustomerService service = new CustomerService(3);
service.serveCustomer();
System.out.println("1=========");
service.addCustomer("Arthur");
service.addCustomer("Bruce");
service.addCustomer("Clark");
service.addCustomer("Kara");
System.out.println("2=========");
service.serveCustomer();
service.serveCustomer();
System.out.println("3=========");
service.addCustomer("Diana");
service.addCustomer("Victor");
service.addCustomer("Harley");
System.out.println("4=========");
service.serveCustomer();
service.serveCustomer();
service.serveCustomer();
service.serveCustomer();
}
} 