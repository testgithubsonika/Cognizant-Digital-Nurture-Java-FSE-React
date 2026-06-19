package Week_1.Design_Principles.Dependency_injection ;
public interface CustomerRepository{

    String findCustomerById(int id);
    String findCustomerByName(String name);
}
