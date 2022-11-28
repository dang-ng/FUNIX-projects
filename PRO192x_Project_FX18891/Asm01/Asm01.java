import java.math.BigInteger;
import java.util.Scanner;

public class Asm01 {
    public static final String AUTHOR = "FX18891";
    public static final String VERSION = "@v1.0.0";
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.printf("| NGAN HANG SO | %-7s%-24s%s%n", AUTHOR, VERSION, "|");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Nhap CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        Scanner scn = new Scanner(System.in);

//      Kiểm tra user nhập số đúng định dạng không
        int choose = -1;
        int choose2 = -1;
        do {
            System.out.print("Chuc nang: ");
            choose = inputNumber(scn);
            if (choose != 0 && choose != 1){
                System.out.println("Vui long chi nhap 0 hoac 1.");
            }
        } while (choose != 0 && choose != 1);

//      Nếu nhập 0 hoặc 1
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
            String cccd = scn.next();
            while(!isValid(cccd)){
                System.out.println("Vui long nhap so CCCD dung dinh dang 12 so.");
                cccd = scn.next();
            }

            String[] cities = {"","Hà Nội","Hà Giang","","Cao Bằng","","Bắc Kạn","","Tuyên Quang","","Lào Cai","Điện Biên","Lai Châu","","Sơn La","Yên Bái","","Hòa Bình","","Thái Nguyên","Lạng Sơn","","Quảng Ninh","","Bắc Giang","Phú Thọ","Vĩnh Phúc","Bắc Ninh","","","Hải Dương","Hải Phòng","","Hưng Yên","Thái Bình","Hà Nam","Nam Định","Ninh Bình","Thanh Hóa","","Nghệ An","","Hà Tĩnh","","Quảng Bình","Quảng Trị","Thừa Thiên Huế","","Đà Nẵng","Quảng Nam","","Quảng Ngãi","Bình Định","","Phú Yên","","Khánh Hòa","","Ninh Thuận","","Bình Thuận","","Kon Tum","","Gia Lai","","Đắk Lắk","Đắk Nông","Lâm Đồng","","Bình Phước","","Tây Ninh","","Bình Dương","Đồng Nai","","Bà Rịa - Vũng Tàu","","Hồ Chí Minh","Long An","","Tiền Giang","Bến Tre","Trà Vinh","","Vĩnh Long","Đồng Tháp","","An Giang","","Kiên Giang","Cần Thơ","Hậu Giang","Sóc Trăng","Bạc Liêu","Cà Mau"};
            BigInteger cccd2 = new BigInteger(cccd);
            do {
                System.out.println("    | 1. Kiem tra noi sinh");
                System.out.println("    | 2. Kiem tra tuoi, gioi tinh");
                System.out.println("    | 3. Kiem tra so ngau nhien");
                System.out.println("    | 0. Thoat");
                System.out.print("Chuc nang: ");
                choose2 = inputNumber(scn);
            if (choose2 != 1 && choose2 != 2 && choose2 != 3 && choose2 != 0){
                System.out.println("Vui long nhap theo lua chon ben tren.");
            }

//            Kiem tra noi sinh
            if (choose2 == 1){
                int firstpart = cccd2.divide(BigInteger.valueOf(1000000000)).intValue();
                System.out.println("Noi sinh: " + cities[firstpart]);
            }

//            Kiem tra tuoi, gioi tinh
            if (choose2 == 2){
                int secondpart = cccd2.divide(BigInteger.valueOf(100000000)).remainder(BigInteger.valueOf(10)).intValue();
                int fullbirthyear = 0;
                String gender = "";
                int birthyear = cccd2.divide(BigInteger.valueOf(1000000)).remainder(BigInteger.valueOf(100)).intValue();
                switch (secondpart) {
                    case 0 -> {
                        gender = "Nam";
                        fullbirthyear = 1900 + birthyear;
                    }
                    case 1 -> {
                        gender = "Nu";
                        fullbirthyear = 1900 + birthyear;
                    }
                    case 2 -> {
                        gender = "Nam";
                        fullbirthyear = 2000 + birthyear;
                    }
                    case 3 -> {
                        gender = "Nu";
                        fullbirthyear = 2000 + birthyear;
                    }
                    case 4 -> {
                        gender = "Nam";
                        fullbirthyear = 2100 + birthyear;
                    }
                    case 5 -> {
                        gender = "Nu";
                        fullbirthyear = 2100 + birthyear;
                    }
                    case 6 -> {
                        gender = "Nam";
                        fullbirthyear = 2200 + birthyear;
                    }
                    case 7 -> {
                        gender = "Nu";
                        fullbirthyear = 2200 + birthyear;
                    }
                    case 8 -> {
                        gender = "Nam";
                        fullbirthyear = 2300 + birthyear;
                    }
                    case 9 -> {
                        gender = "Nu";
                        fullbirthyear = 2300 + birthyear;
                    }
                    default -> {
                        gender = "";
                        fullbirthyear = 0;
                    }
                }
                System.out.println("Gioi tinh: " + gender + " | " + fullbirthyear);
            }
            if (choose2 == 3){
                int thirdpart = cccd2.remainder(BigInteger.valueOf(1000000)).intValue();
                System.out.printf("So ngau nhien: %06d\n", thirdpart);
            }
            } while (choose2 != 0);
        }
        scn.close();
    }
    static int inputNumber(Scanner scn){
        while (!scn.hasNextInt()){
            scn.nextLine();
            System.out.println("Khong dung dinh dang, xin vui long thu lai.");
            System.out.print("Chuc nang: ");
        }
        return scn.nextInt();
    }
    public static boolean isValid(String cccd){
        if (cccd.length() != 12) return false;
        try {
            BigInteger i = new BigInteger(cccd);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}