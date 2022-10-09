import java.text.NumberFormat;
import java.util.Locale;

public class Account {
    private String accountNumber;
    private double balance;
    public Account (String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public Account (String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
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
}
