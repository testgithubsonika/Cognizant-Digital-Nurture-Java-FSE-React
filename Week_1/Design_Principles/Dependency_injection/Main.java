package Week_1.Design_Principles.Dependency_injection;

public class Main {
    public static void main(String[] s){
        CustomerRepository Repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(Repository);
        System.out.println(' '); 
        System.out.println("!Hello Customer "); 
        service.getCustomer(100);
        service.getCustomerN("john");
        service.getCustomer(200);
        service.getCustomerN("sonika singh tomar");
    }
    
}
