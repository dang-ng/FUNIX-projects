import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private final String id;
    private final List<Customer> customers;
    public Bank (){
        this.customers = new ArrayList<>();
        this.id = String.valueOf(UUID.randomUUID());
    }
    public String getId(){
        return this.id;
    }
    public void addCustomer (Customer newCustomer){

    }
    public void addAccount (String customerId, Account acount){

    }
    public boolean isCustomerExisted (String customerId){
        return true;
    }
    public List<Customer> getCustomers(){
        return customers;
    }
}
