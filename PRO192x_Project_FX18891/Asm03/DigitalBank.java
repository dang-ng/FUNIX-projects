import java.util.Objects;

public class DigitalBank extends Bank {
    public DigitalBank (){
        super();
        addCustomer(new Customer("DANG","079089018337"));
    }
    public Customer getCustomerById (String customerId){
        for (Customer customer : getCustomers()){
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void withdraw (String customerId, String accountNumber, double amount){
        for (Customer customer : getCustomers()){
            if (Objects.equals(customer.getCustomerId(), customerId)){
                for (Account account : customer.getAccount()){
                    if (account.getAccountNumber().equals(accountNumber)) {
                        if (account instanceof SavingsAccount) ((SavingsAccount) account).withdraw(amount);
                        else ((LoansAccount) account).withdraw(amount);
                    }
                }
            }
        }
    }
}
