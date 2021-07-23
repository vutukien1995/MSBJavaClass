package com.msb.lesson7.Sample.bai2;

import java.util.Scanner;

/**
 * @author kienvt2
 */
public class Main {

    static BienLai[] bienLais = new BienLai[1000];
    static int soBienLai = 0;

    public static void main(String[] args) {
        // Khởi tạo:
        BienLai bienLai1 = new BienLai(123, 158);
        KhachHang khachHang1 = new KhachHang("Neo", "Bắc Ninh", "001");
        bienLai1.setKhachHang(khachHang1);
        themBienLai(bienLai1);

        BienLai bienLai2 = new BienLai(236, 525);
        KhachHang khachHang2 = new KhachHang("Cường", "Hải Dương", "002");
        bienLai2.setKhachHang(khachHang2);
        themBienLai(bienLai2);

        // Console:
        boolean isExit = true;
        while (isExit) {
            switch (menu()) {
                case "1":
                    showDanhSach();
                    break;
                case "2":
                    nhapBienLai();
                    break;
                case "3":
                    suaBienLai();
                    break;
                case "4":
                    xoaBienLai();
                    break;
                case "5":
                    isExit = false;
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Nhập trong menu (1-5)");
            }
        }
    }

    public static String menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Show DS Biên lai.");
        System.out.println("2. Thêm Biên lai.");
        System.out.println("3. Sửa Biên lai.");
        System.out.println("4. Xóa Biên lai.");
        System.out.println("5. Kết thúc.");
        return sc.nextLine();
    }

    public static void showDanhSach() {
        if (soBienLai == 0) {
            System.out.println("Danh sách biên lại rỗng !");
        } else {
            for(int i = 0; i<soBienLai; i++) {
                System.out.println("- Biên lai " + (i+1) + ": ");
                bienLais[i].show();
            }
        }
    }

    public static void nhapBienLai(){
        BienLai bienLai = new BienLai();
        bienLai.nhap();
        themBienLai(bienLai);
        showDanhSach();
    }

    public static void themBienLai(BienLai bienLai) {
        bienLais[soBienLai] = bienLai;
        soBienLai++;
    }

    public static void suaBienLai() {
        while (true) {
            System.out.println("Bạn muốn sửa biên lai số: ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0 || input > soBienLai) {
                System.out.println("Không có số biên lai hợp lệ: ");
            } else {
                bienLais[input-1].nhap();
                break;
            }
        }
    }

    public static void xoaBienLai() {
        while (true) {
            System.out.println("Bạn muốn xóa biên lai số: ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0 || input > soBienLai) {
                System.out.println("Không có số biên lai hợp lệ: ");
            } else {
                input = input-1;
                for(int i = 0; i<soBienLai; i++){
                    if(i >= input) {
                        bienLais[i] = bienLais[i+1];
                    }
                }
                soBienLai--;
                break;
            }
        }
    }

}
