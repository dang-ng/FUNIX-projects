public class SavingsAccount extends Account implements ReportService, Withdraw {
        private final int SAVINGS_ACCOUNT_MAX_WITHDRAW = 5000000;


        public void addAccount (String customerId, Account account){
            for (Customer customer: customers){
                if (isCustomerExisted(customerId)){
                    customer.addAccount(account);
                }
            }
        }
        public boolean isCustomerExisted(String customerId){
            for (Customer customer : customers){
                if (customer.getCustomerId().equals(customerId)){
                    return true;
                }
            }
            return false;
        }

}
