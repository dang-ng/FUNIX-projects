public class LoansAccount extends Account implements ReportService, Withdraw {
    private final double LOAN_ACCOUNT_WITHDRAW_FEE = 0.05;
    private final double LOAN_ACCOUNT_WITHDRAW_PREMIUM_FEE = 0.01;
    private final int LOAN_ACCOUNT_MAX_BALANCE = 100000000;

    public void addAccount (String customerId, Account account){
        for (Customer customer: customers){
            if (isCustomerExisted(customerId)){
                customer.addAccount(account);
            }
        }
    }

    @Override
    public boolean withdraw (double amount){
        double newBalance = 0.0;
        if (isAccepted(newBalance)){
            setBalance(newBalance);

            return true;
        }
        return false;
    }

    @Override
    public boolean isAccepted (double amount){

    }

    @Override
    public void log (double amount){
        System.out.println(Utils.getDivider());
        System.out.printf("%30s%n", getTitle());
        System.out.printf("NGAY G/D: %28s%n", Utils.getDateTime());
        System.out.printf("ATM ID: %30s%n", "DIGITAL-BANK-ATM 2022");
        System.out.printf("SO TK: %31s%n", account.getAccountNumber());
        System.out.printf("SO TIEN: %29s%n", Utils.formatBalance(amount));
        System.out.printf("SO DU: %31s%n", Utils.formatBalance(account.getBalance()));
        System.out.printf("PHI + VAT: %27s%n", Utils.formatBalance(account.getTransactionFee()*amount));
        System.out.println(Utils.getDivider());
    }
}
