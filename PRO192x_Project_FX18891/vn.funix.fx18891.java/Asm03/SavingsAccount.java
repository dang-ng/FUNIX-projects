public class SavingsAccount extends Account implements ReportService, Withdraw {
        private final int SAVINGS_ACCOUNT_MAX_WITHDRAW = 5000000;

        public SavingsAccount (String accountNumber, double balance){
            super(accountNumber, balance);
        }
//        public void addAccount (String customerId, Account account){
//            for (Customer customer: customers){
//                if (isCustomerExisted(customerId)){
//                    customer.addAccount(account);
//                }
//            }
//        }
//        public boolean isCustomerExisted(String customerId){
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
            newBalance = this.getBalance() - amount;
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

    @Override
    public boolean isAccepted (double amount){
        if (this.isPremium() && getBalance() - amount >= 50000 && amount % 10000 == 0) return true;
        else if (!this.isPremium() && getBalance() - amount >= 50000 && amount <= SAVINGS_ACCOUNT_MAX_WITHDRAW && amount % 10000 == 0) return true;
        else return false;
    }

    @Override
    public void log (double amount){
        System.out.println("+--------------------------------+");
        System.out.println("BIEN LAI GIAO DICH SAVINGS");
        System.out.printf("NGAY G/D: %28s%n", getDateTime());
        System.out.printf("ATM ID: %30s%n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s%n", getAccountNumber());
        System.out.printf("SO TIEN: %29s%n", amount);
        System.out.printf("SO DU: %31s%n", getBalance());
        System.out.printf("PHI + VAT: %27s%n", 0);
        System.out.println("+--------------------------------+");
    }

    @Override
    public String toString (){
        return this.getAccountNumber() + "       |    SAVINGS |                    " + String.format("%,.0f",this.getBalance()) + "đ";
    }

}
