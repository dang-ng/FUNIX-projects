public class DigitalBank extends Bank {
    public Customer getCustomerById (String customerId){
        //Chỉ trả về khách hàng nếu như tồn tại CCCD trong hệ thống ngân hàng,
        // ngược lại trả về null.
    }
    public void addCustomer (String customerId, String name){
        //để tạo khách hàng cho ngân hàng
    }
    public void withdraw (String customerId, String accountNumber, double amount){
        // kiểm tra nếu customerId không tồn tại thì trả về ,
        // ngược lại có tồn tại thì gọi hàm withdraw của đối tượng khách hàng tìm được.
    }
}
