public class LoansAccount extends Account implements ReportService, Withdraw {
    private final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
    private final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
    private final int LOAN_ACCOUNT_MAX_BALANCE = 100000000;
    public LoansAccount (String accountNumber, double balance){
        super(accountNumber, balance);
    }

    // lenh rut tien
    @Override
    public boolean withdraw (double amount){
        double newBalance, fee;
        if (isAccepted(amount)){
            fee = fee(amount);
            newBalance = this.getBalance() + amount + fee;
            setBalance(newBalance);
            System.out.println("Rut tien thanh cong!");
            log(amount, fee);
            saveTransaction(new Transaction(amount, true));
            return true;
        }
        else {
            System.out.println("Rut tien khong thanh cong.");
            saveTransaction(new Transaction(amount, false));
            return false;
        }
    }
    public double fee (double amount){
        if (this.isPremium()) return LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE*amount;
        else return LOAN_ACCOUNT_WITHDRAW_FEE*amount;
    }
    @Override
    public boolean isAccepted (double amount){
        if (fee(amount) + getBalance() + amount <= 99950000) return true;
        else return false;
    }

    // tao bao cao
    @Override
    public void log (double amount, double fee){
        System.out.println("+------------------------------------+");
        System.out.println("BIEN LAI GIAO DICH LOAN");
        System.out.printf("NGAY G/D: %28s%n", getDateTime());
        System.out.printf("ATM ID: %30s%n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s%n", getAccountNumber());
        System.out.printf("SO TIEN: %29s%n", String.format("%,.0fđ",amount));
        System.out.printf("SO DU: %31s%n", String.format("%,.0fđ", getBalance()));
        System.out.printf("PHI + VAT: %27s%n", String.format("%,.0fđ",fee));
        System.out.println("+------------------------------------+");
    }

    // in ket qua tong ket
    @Override
    public String toString (){
        return this.getAccountNumber() + "       |        LOAN |" + String.format("%,22.0f",this.getBalance()) + "đ";
    }
}
