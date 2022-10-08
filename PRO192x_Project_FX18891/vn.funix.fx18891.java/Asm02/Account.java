public class Account {
    private String accountNumber;
    private double balance;
    public Account (){

    }
    public double getBalance (){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public boolean isPremium (){
        return this.balance >= 1000000.0;
    }
    public String toString (){
        System.out.println(accountNumber + balance);
        return null;
    }
}
