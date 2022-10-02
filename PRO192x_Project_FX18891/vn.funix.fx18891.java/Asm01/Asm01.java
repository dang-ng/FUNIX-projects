import java.util.Scanner;

public class Asm01 {
    public static void main(String[] args) {
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| NGAN HANG SO | FX18891@v1.0.0                 |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.println("| 1. Nhap CCCD                                  |");
        System.out.println("| 0. Thoat                                      |");
        System.out.println("+----------+-------------------------+----------+");
        System.out.print("Chuc nang: ");
        Scanner scn = new Scanner(System.in);

//        Kiểm tra user nhập số không
        while (!scn.hasNextInt()){
            System.out.println("Vui long chi nhap 0 hoac 1.");
            System.out.print("Chuc nang: ");
            scn = new Scanner(System.in);
        }

//        Kiểm tra user nhập 1 hay 0
        int choose = scn.nextInt();
        if (choose == 1) {
            int rnd = (int)(Math.random()*900)+100; // ra số ngẫu nhiên từ 100-999
            System.out.println("Nhap ma xac thuc: " + rnd);
            scn = new Scanner(System.in);
            // kiểm tra mã xác thực phải số không
            while (!scn.hasNextInt()) {
                System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                scn = new Scanner(System.in);
            }
            int code = scn.nextInt();
            // kiểm tra mã xác thử đúng không
            while (code != rnd) {
                System.out.println("Ma xac thuc khong dung. Vui long thu lai.");
                scn = new Scanner(System.in);
            }
            // Nhập số CCCD
            System.out.print("Vui long nhap so CCCD: ");

        }





        scn.close();
    }
}