import java.util.Scanner;

public class Asm03 {
    private static final int EXIT_COMMAND_CODE = 0;
    private static final int EXIT_ERROR_CODE = -1;
    private static final DigitalBank activeBank = new DigitalBank();
    private static final String CUSTOMER_ID = "079089018337";
    private static final String CUSTOMER_NAME = "DANG";

    // in ket qua tong ket
    private static void showCustomer(){
        Customer customer = activeBank.getCustomerById(CUSTOMER_ID);
        if (customer != null) {
            customer.displayInformation();
            customer.getAccount().forEach(account -> {
                System.out.println(account.toString());
            });
        }
    }

    // kiem tra so nhap vao dung format khong
    public static int inputNumber(Scanner scn){
        while (!scn.hasNextInt()){
            scn.nextLine();
            System.out.println("Khong dung dinh dang, xin vui long nhap lai: ");
        }
        return scn.nextInt();
    }

    // kiem tra account hop le khong
    public static boolean accountValid(String accountNumber){
        if (accountNumber.length() != 6) return false;
        try {
            int i = Integer.parseInt(accountNumber);
        } catch (Exception E){
            return false;
        }
        return true;
    }

    // ham Main
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX18891@v3.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Thong tin khach hang                       |");
        System.out.println("| 2. Them tai khoan ATM                         |");
        System.out.println("| 3. Them tai khoan tin dung                    |");
        System.out.println("| 4. Rut tien                                   |");
        System.out.println("| 5. Lich su giao dich                          |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        Scanner scn = new Scanner(System.in);

        int choose = -1;
        String accountNumber;
        int balance;
        int amount;

        // Kiểm tra lựa chọn hợp lệ không
        do {
            System.out.println("Vui long chon chuc nang: ");
            choose = inputNumber(scn);
            scn.nextLine();

            // Neu user chon 1
            if (choose == 1) {
                showCustomer();
            }

            // Neu user chon 2
            if (choose == 2){
                System.out.println("Nhap ma so tai khoan gom 6 chu so:");
                accountNumber = scn.next();
                while (!accountValid(accountNumber)){
                    System.out.println("Vui long nhap dung dinh dang 6 chu so");
                    accountNumber= scn.next();
                }
                System.out.println("Nhap so du:");
                balance = inputNumber(scn);
                while (balance<50000){
                    System.out.println("So du phai lon hon 50.000đ");
                    balance = inputNumber(scn);
                }
                activeBank.addAccount(CUSTOMER_ID,accountNumber,balance,"saving");
                scn.nextLine();
            }

            // Neu user chon 3
            if (choose == 3){
                System.out.println("Nhap ma so tai khoan gom 6 chu so:");
                accountNumber = scn.next();
                while (!accountValid(accountNumber)){
                    System.out.println("Vui long nhap dung dinh dang 6 chu so");
                    accountNumber = scn.next();
                }
                activeBank.addAccount(CUSTOMER_ID,accountNumber,0,"loan");
                scn.nextLine();
            }

            // Neu user chon 4
            if (choose == 4){
                System.out.println("Vui long nhap so tai khoan muon rut:");
                accountNumber = scn.next();
                while (!accountValid(accountNumber) || !activeBank.getCustomerById(CUSTOMER_ID).isAccountExisted(accountNumber)){
                    System.out.println("Tai khoan khong ton tai trong he thong.");
                    accountNumber = scn.next();
                }
                System.out.println("Nhap so tien muon rut:");
                amount = inputNumber(scn);
                while (amount < 50000){
                    System.out.println("So tien rut phai lon hon hoac bang 50.000đ");
                    amount = inputNumber(scn);
                }
                activeBank.withdraw(CUSTOMER_ID,accountNumber,(double)amount);

                scn.nextLine();
            }

            // Neu user chon 5
            if (choose == 5){
                showCustomer();
                activeBank.getCustomerById(CUSTOMER_ID).printTransaction();
            }

        } while (choose != 0); // Thoat neu user chon 0


    }
}