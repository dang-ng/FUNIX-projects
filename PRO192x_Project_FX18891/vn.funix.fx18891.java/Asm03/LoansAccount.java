public class LoansAccount extends Account implements ReportService, Withdraw {
    private final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
    private final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
    private final int LOAN_ACCOUNT_MAX_BALANCE = 100000000;
    public LoansAccount (String accountNumber, double balance){
        super(accountNumber, balance);
    }
//    public void addAccount (String customerId, Account account){
//        for (Customer customer: customers){
//            if (isCustomerExisted(customerId)){
//                customer.addAccount(account);
//            }
//        }
//    }
//    public boolean isCustomerExisted(String customerId){
//            for (Customer customer : customers){
//                if (customer.getCustomerId().equals(customerId)){
//                    return true;
//                }
//            }
//            return false;
//        }

    @Override
    public boolean withdraw (double amount){
        double newBalance;
        if (isAccepted(amount)){
            newBalance = this.getBalance() + amount + fee(amount);
            setBalance(newBalance);
            System.out.println("Rut tien thanh cong!");
            log(amount);
            return true;
        }
        else {
            System.out.println("Rut tien khong thanh cong.");
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

    @Override
    public void log (double amount){
        System.out.println("+--------------------------------+");
        System.out.println("BIEN LAI GIAO DICH LOAN");
        System.out.printf("NGAY G/D: %28s%n", getDateTime());
        System.out.printf("ATM ID: %30s%n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s%n", getAccountNumber());
        System.out.printf("SO TIEN: %29s%n", amount);
        System.out.printf("SO DU: %31s%n", getBalance());
        System.out.printf("PHI + VAT: %27s%n", fee(amount));
        System.out.println("+--------------------------------+");
    }

    @Override
    public String toString (){
        return this.getAccountNumber() + "       |       LOAN |                    " + String.format("%,.0f",this.getBalance()) + "đ";
    }
}
