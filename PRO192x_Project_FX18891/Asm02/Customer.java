import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Customer extends User {
    private List<Account> accounts;
    public Customer (String name, String customerId){
        super(name, customerId);
        this.accounts = new ArrayList<>();
    }
    public List<Account> getAccount(){
        return this.accounts;
    }
    public String isPremium(){
        for (ListIterator<Account> i = accounts.listIterator(); i.hasNext();){
            Account account = i.next();
            if (account.isPremium()) return "Premium";
        }
        return "Normal";
    }
    public void addAccount(String a,double b){
        if (a.length() != 6) return;
        try {
            BigInteger i = new BigInteger(a);
        } catch (Exception e) {return;}
        for (ListIterator<Account> i = this.accounts.listIterator();i.hasNext();){
            Account account = i.next();
            if(account.getAccountNumber().equals(a)) {
//                account.addBalance(b);
                System.out.println("So tai khoan da ton tai.");
                return;
            }
        }
        System.out.println("Tai khoan moi da duoc them vao!");
        accounts.add(new Account(a,b));
    }
    public double getBalance(){
        double sum = 0.0;
        for (ListIterator<Account> i = accounts.listIterator();i.hasNext();){
            Account account = i.next();
            sum += account.getBalance();
        }
        return sum;
    }
    public void displayInformation (){
        System.out.println(super.getCustomerId() + " |     "+ super.getName() + " | "+ this.isPremium()+ " | " +String.format("%,.0f",this.getBalance()) + "đ");

    }
}
