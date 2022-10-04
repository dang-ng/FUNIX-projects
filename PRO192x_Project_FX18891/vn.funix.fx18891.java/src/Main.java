import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX18891@v1.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Nhap CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        Scanner scn = new Scanner(System.in);

//        Kiểm tra user nhập số đúng định dạng không
        int choose  = -1;
        do {
            System.out.print("Chuc nang: ");
            choose = inputNumber(scn);
//            while (!scn.hasNextInt()){
//                scn.nextLine();
//                System.out.println("Vui long nhap so");
//                System.out.print("Chuc nang: ");
//            }
//            return scn.nextInt();
            if (choose != 0 && choose != 1) {
                System.out.println("Vui long nhap 0 hoac 1");
            }
        } while (choose != 0 && choose != 1);

        System.out.println("Da nhap: " + choose);

//        Kiểm tra user nhập 1 hay 0
        if (choose == 0) System.exit(0);
        if (choose == 1) {
            int rnd = (int)(Math.random()*900)+100; // ra số ngẫu nhiên từ 100-999
            System.out.println("Nhap ma xac thuc: " + rnd);
            // kiểm tra mã xác thực
            while (!scn.hasNextInt() || scn.nextInt() != rnd) {
                System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                scn = new Scanner(System.in);
            }

            // Nhập số CCCD
            System.out.print("Vui long nhap so CCCD: ");
            int cccd = inputNumber(scn);
            String[] cities = {"","Hà Nội","Hà Giang","","Cao Bằng","","Bắc Kạn","","Tuyên Quang","","Lào Cai","Điện Biên","Lai Châu","","Sơn La","Yên Bái","","Hòa Bình","","Thái Nguyên","Lạng Sơn","","Quảng Ninh","","Bắc Giang","Phú Thọ","Vĩnh Phúc","Bắc Ninh","","","Hải Dương","Hải Phòng","","Hưng Yên","Thái Bình","Hà Nam","Nam Định","Ninh Bình","Thanh Hóa","","Nghệ An","","Hà Tĩnh","","Quảng Bình","Quảng Trị","Thừa Thiên Huế","","Đà Nẵng","Quảng Nam","","Quảng Ngãi","Bình Định","","Phú Yên","","Khánh Hòa","","Ninh Thuận","","Bình Thuận","","Kon Tum","","Gia Lai","","Đắk Lắk","Đắk Nông","Lâm Đồng","","Bình Phước","","Tây Ninh","","Bình Dương","Đồng Nai","","Bà Rịa - Vũng Tàu","","Hồ Chí Minh","Long An","","Tiền Giang","Bến Tre","Trà Vinh","","Vĩnh Long","Đồng Tháp","","An Giang","","Kiên Giang","Cần Thơ","Hậu Giang","Sóc Trăng","Bạc Liêu","Cà Mau"};

            do {
                System.out.println("    | 1. Kiem tra noi sinh");
                System.out.println("    | 2. Kiem tra tuoi, gioi tinh");
                System.out.println("    | 3. Kiem tra so ngau nhien");
                System.out.println("    | 0. Thoat");
                System.out.print("Chuc nang: ");

            } while (true);

        }





        scn.close();
    }

    static int inputNumber(Scanner scn) {
        while (!scn.hasNextInt()){
            scn.nextLine();
            System.out.println("Vui long nhap so");
            System.out.print("Chuc nang: ");
        }
        return scn.nextInt();
    }
}