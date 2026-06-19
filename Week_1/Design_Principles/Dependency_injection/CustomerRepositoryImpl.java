package Week_1.Design_Principles.Dependency_injection ;

public class CustomerRepositoryImpl implements 
CustomerRepository {

     @Override
    public String findCustomerById(int id){
        return "Customer ID: "+id;
    }
    public String findCustomerByName(String name){
        return "Customer Name: "+name;
    }
}