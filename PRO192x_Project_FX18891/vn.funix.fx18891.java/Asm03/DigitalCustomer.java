public class DigitalCustomer extends Customer {

    public DigitalCustomer(String name, String customerId) {
        super(name, customerId);
    }

    public void withdraw (String accountNumber, double amount){
        //kiểm tra nếu accountNumber có tồn tại thì truy xuất đối tượng đó ra
        // và gọi hàm withdraw của đối tượng đó.
    }

}
