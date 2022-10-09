import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.IntBinaryOperator;

public class Customer extends User {
    private List<Account> accounts;
    public Customer (){
        this.accounts = new ArrayList<>();
    }
    public List<Account> getAccount(){
        return this.accounts;
    }
    public String isPremium(){
        for (ListIterator i = accounts.listIterator();i.hasNext();){
            Account a = new Account(i.next());
            if (a.isPremium()) return "Normal";
        }
        return "Premium";
    }
    public void addAccount(String a){
        if (a.length() != 6) return;
        try {
            BigInteger i = new BigInteger(a);
        } catch (Exception e) {return;}
        accounts.add(new Account(a));
    }
    public double getBalance(){
        double sum = 0.0;
        for (ListIterator i = accounts.listIterator();i.hasNext();){
            sum += i.next().getBalance();
        }
        return sum;
    }
    public void displayInformation (){
        System.out.println(super.getCustomerId() + " |     "+ super.getName() + " | "+ this.isPremium()+ " | " +this.getBalance() + "đ");

    }
}
