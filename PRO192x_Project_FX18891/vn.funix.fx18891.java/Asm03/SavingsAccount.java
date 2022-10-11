public class SavingsAccount extends Account implements ReportService, Withdraw {
        private final int SAVINGS_ACCOUNT_MAX_WITHDRAW = 5000000;

        public SavingsAccount (String accountNumber, double balance){
            super(accountNumber, balance);
        }

        // lenh rut tien
    @Override
    public boolean withdraw (double amount){
        double newBalance;
        if (isAccepted(amount)){
            newBalance = this.getBalance() - amount;
            setBalance(newBalance);
            System.out.println("Rut tien thanh cong!");
            log(amount,0);
            saveTransaction(new Transaction(amount, true));
            return true;
        }
        else {
            System.out.println("Rut tien khong thanh cong.");
            saveTransaction(new Transaction(amount, false));
            return false;
        }

    }

    @Override
    public boolean isAccepted (double amount){
        if (this.isPremium() && getBalance() - amount >= 50000 && amount % 10000 == 0) return true;
        else if (!this.isPremium() && getBalance() - amount >= 50000 && amount <= SAVINGS_ACCOUNT_MAX_WITHDRAW && amount % 10000 == 0) return true;
        else return false;
    }

    // tao bao cao
    @Override
    public void log (double amount, double fee){
        System.out.println("+------------------------------------+");
        System.out.println("BIEN LAI GIAO DICH SAVINGS");
        System.out.printf("NGAY G/D: %28s%n", getDateTime());
        System.out.printf("ATM ID: %30s%n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s%n", getAccountNumber());
        System.out.printf("SO TIEN: %29s%n", String.format("%,.0fđ",amount));
        System.out.printf("SO DU: %31s%n", String.format("%,.0fđ",getBalance()));
        System.out.printf("PHI + VAT: %26sđ%n", fee);
        System.out.println("+------------------------------------+");
    }

    // in ra ket qua tong ket
    @Override
    public String toString (){
        return this.getAccountNumber() + "       |     SAVINGS |" + String.format("%,22.0f",this.getBalance()) + "đ";
    }

}
