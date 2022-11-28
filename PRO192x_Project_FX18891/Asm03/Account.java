import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Account {
    private List<Transaction> transaction;
    private String accountNumber;
    private double balance;
    public Account (String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.transaction = new ArrayList<>();
    }
    public Account (String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transaction = new ArrayList<>();
    }
    public List<Transaction> getTransaction(){
        return this.transaction;
    }
    public void saveTransaction(Transaction transaction){
        this.transaction.add(transaction);
    }
    public double getBalance (){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void addBalance(double balance){this.balance+=balance;}
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public boolean isPremium (){
        return this.balance >= 10000000.0;
    }
    public String toString (){
        return this.accountNumber + "       |                    " + String.format("%,.0f",this.balance) + "đ";
    }

    // ham lay ngay thang
    public static String getDateTime(){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        return df.format(today);
    }

}

