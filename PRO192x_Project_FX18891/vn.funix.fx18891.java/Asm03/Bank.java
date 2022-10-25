import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
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

    // tao user moi
    public void addCustomer (Customer newCustomer){
        for (ListIterator<Customer> i = customers.listIterator(); i.hasNext();){
            Customer customer = i.next();
            if (newCustomer.getCustomerId().equals(customer.getCustomerId())) {
                System.out.println("So CCCD da ton tai trong he thong!");
                return;
            }
        }
        customers.add(newCustomer);
        System.out.println("Khach hang moi da duoc them vao!");
    }
    public void addAccount (String customerId, String account, double balance,String type){
        for (ListIterator<Customer> i = customers.listIterator();i.hasNext();){
            Customer customer = i.next();
            if (customer.getCustomerId().equals(customerId)) {
                customer.addAccount(account,balance,type);
            }
        }
    }
    public boolean isCustomerExisted (String customerId){
        for (ListIterator<Customer> i = customers.listIterator();i.hasNext();){
            Customer customer = i.next();
            if (customer.getCustomerId().equals(customerId)) return true;
        }
        return false;
    }
    public List<Customer> getCustomers(){
        return customers;
    }
}
