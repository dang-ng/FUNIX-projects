import java.math.BigInteger;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Asm02 {

    private static final Bank bank = new Bank();

    // kiem tra cccd
    public static boolean isValid(String cccd){
        if (cccd.length() != 12) return false;
        try {
            BigInteger i = new BigInteger(cccd);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    // kiem tra account hop le khong
    public static boolean accountValid(String accountNumber){
        if (accountNumber.length()!=6) return false;
        try {
            BigInteger i = new BigInteger(accountNumber);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    // kiem tra so nhap vao dung format khong
    public static int inputNumber(Scanner scn){
        while (!scn.hasNextInt()){
            scn.nextLine();
            System.out.println("Khong dung dinh dang, xin vui long nhap lai: ");
        }
        return scn.nextInt();
    }

    // ham main
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX18891@v2.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Them khach hang                            |");
        System.out.println("| 2. Them tai khoan cho khach hang              |");
        System.out.println("| 3. Hien thi danh sach khach hang              |");
        System.out.println("| 4. Tim theo CCCD                              |");
        System.out.println("| 5. Tim theo ten khach hang                    |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        Scanner scn = new Scanner(System.in);

        int choose = -1;
        String customerName;
        String cccd;
        String accountNumber;
        int balance;

        // Kiểm tra lựa chọn hợp lệ không
        do {
            System.out.println("Vui long chon chuc nang: ");
            choose = inputNumber(scn);
            scn.nextLine();

        // Neu user chon 1
        if (choose == 1) {
            System.out.println("Nhap ten khach hang: ");
            customerName = scn.nextLine();
            System.out.println("Nhap so CCCD: ");
            cccd = scn.next();
            while (!isValid(cccd)){
                System.out.println("Vui long nhap CCCD dung dinh dang 12 so.");
                cccd = scn.next();
            }
            bank.addCustomer(new Customer(customerName, cccd));
            scn.nextLine();
        }

        // Neu user chon 2
        if (choose == 2){
            System.out.println("Nhap CCCD khach hang: ");
            cccd = scn.next();
            while (!bank.isCustomerExisted(cccd)){
                System.out.println("So CCCD khong co trong he thong. Xin vui long nhap lai");
                cccd = scn.next();
            }
            System.out.println("Nhap ma STK gom 6 chu so: ");
            accountNumber = scn.next();
            while (!accountValid(accountNumber)){
                System.out.println("Ma STK khong hop le.");
                accountNumber = scn.next();
            }
            System.out.println("Nhap so du: ");
            balance = inputNumber(scn);
            while (balance < 50000) {
                System.out.println("So du phai lon hon 50.000vnd.");
                balance = inputNumber(scn);
            }
            bank.addAccount(cccd,accountNumber,balance);
            scn.nextLine();
        }

        // Neu user chon 3
        if (choose == 3){
            bank.getCustomers().forEach(customer -> {
                customer.displayInformation();
                customer.getAccount().forEach(account ->{
                    System.out.println(account.toString());
                });
            });
        }

        // Neu user chon 4
            if (choose == 4){
                System.out.println("Vui long nhap so CCCD can tim: ");
                cccd = scn.next();
                while (!isValid(cccd)){
                    System.out.println("Vui long nhap CCCD dung dinh dang 12 so.");
                    cccd = scn.next();
                }
                String finalCccd = cccd;
                bank.getCustomers().forEach(customer ->{
                    if (customer.getCustomerId().equals(finalCccd)) {
                        customer.displayInformation();
                        customer.getAccount().forEach(account ->{
                            System.out.println(account.toString());
                        });
                    }
                });
                scn.nextLine();
            }

            // Neu user chon 5
            if (choose == 5){
                System.out.println("Vui long nhap ten khach hang can tim: ");
                customerName = scn.next();
                String finalCustomerName = customerName;
                bank.getCustomers().forEach(customer -> {
                    if (customer.getName().contains(finalCustomerName)) {
                        customer.displayInformation();
                        customer.getAccount().forEach(account ->{
                            System.out.println(account.toString());
                        });
                    }
                });
                scn.nextLine();
            }

        } while (choose != 0); // Thoat neu user chon 0
    }
}