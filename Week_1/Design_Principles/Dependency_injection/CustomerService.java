package Week_1.Design_Principles.Dependency_injection;

public class CustomerService {
    private CustomerRepository cr;
    public CustomerService(CustomerRepository cr1){
        this.cr=cr1;
    }
    public void getCustomer(int id){
        String c= cr.findCustomerById(id);
        
        System.out.println(c);
    }
    public void getCustomerN(String id){
        String c= cr.findCustomerByName(id);
        
        System.out.println(c);
    }
    
}
