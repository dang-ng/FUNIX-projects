import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class Customer extends User {
    private List<Account> accounts;
    public Customer (String name, String customerId){
        super(name, customerId);
        this.accounts = new ArrayList<>();
    }
    public List<Account> getAccount(){
        return this.accounts;
    }

    // kiem tra tk premium hay khong
    public String isPremium(){
        for (ListIterator<Account> i = accounts.listIterator(); i.hasNext();){
            Account account = i.next();
            if (account.isPremium()) return "Premium";
        }
        return "Normal";
    }

    // kiem tra tao acc moi
    public void addAccount(String a,double b, String type){
        if (a.length() != 6) return;
        try {
            BigInteger i = new BigInteger(a);
        } catch (Exception e) {return;}
        for (Account account : this.accounts) {
            if (account.getAccountNumber().equals(a)) {
                System.out.println("Tai khoan da ton tai.");
                return;
            }
        }
        if (Objects.equals(type, "loan")){
            System.out.println("Tai khoan Loan moi da duoc them vao!");
            accounts.add(new LoansAccount(a,b));
        }
        else if (Objects.equals(type, "saving")){
            System.out.println("Tai khoan Savings moi da duoc them vao!");
            accounts.add(new SavingsAccount(a,b));
        }
    }

    // lay so du
    public double getBalance(){
        double sum = 0.0;
        for (ListIterator<Account> i = accounts.listIterator();i.hasNext();){
            Account account = i.next();
            sum += account.getBalance();
        }
        return sum;
    }

    // kiem tra acc ton tai
    public boolean isAccountExisted(String accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber().equals(accountNumber)) return true;
        }
        return false;
    }

    // in ket qua tong ket
    public void displayInformation (){
        System.out.println(super.getCustomerId() + " |        "+ super.getName() + " | "+ this.isPremium()+ " | " +String.format("%,11.0f",this.getBalance()) + "đ");

    }

    // in transaction
    public void printTransaction(){
        for (Account account: accounts){
            for (Transaction trans : account.getTransaction()){
                System.out.print(account.getAccountNumber() + "  | ");
                System.out.printf("%15sđ | ", String.format("%,.0f",trans.getAmount()));
                System.out.printf("%20s | ", trans.getTime());
                System.out.printf("%15s | ", trans.getStatus()? "Thanh cong" : "That bai");
                System.out.printf("%n");
            }
        }
    }
}
