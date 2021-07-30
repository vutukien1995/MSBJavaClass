package com.msb.lesson9.lananhntl19.bai4;

import java.util.Scanner;

public class Main {
    static HoaDon[] dsHoaDon = new HoaDon[1000];
    static int soHD = 0;

    public Main() {
    }

    public static void main(String[] args) {
        HoaDon HD1 = new HoaDon(1, "Lan Anh");
        SanPham SP1 = new SanPham("SP001", 70000.0D, 5);
        HD1.setSanPham(SP1);
        themHD(HD1);
        HoaDon HD2 = new HoaDon(2, "Kien");
        SanPham SP2 = new SanPham("SP002", 50000.0D, 8);
        HD1.setSanPham(SP2);
        themHD(HD2);
        boolean isExit = true;

        while(true) {
            while(isExit) {
                String var6;
                switch((var6 = menu()).hashCode()) {
                    case 49:
                        if (var6.equals("1")) {
                            showDanhSach();
                            continue;
                        }
                        break;
                    case 50:
                        if (var6.equals("2")) {
                            nhapHD();
                            continue;
                        }
                        break;
                    case 51:
                        if (var6.equals("3")) {
                            suaHD();
                            continue;
                        }
                        break;
                    case 52:
                        if (var6.equals("4")) {
                            xoaHD();
                            continue;
                        }
                        break;
                    case 53:
                        if (var6.equals("5")) {
                            isExit = false;
                            System.out.println("Kết thúc");
                            continue;
                        }
                }

                System.out.println("Nhập trong menu (1-5)");
            }

            return;
        }
    }

    public static String menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Hiển thị danh sách hóa đơn.");
        System.out.println("2. Thêm hóa đơn.");
        System.out.println("3. Sửa hóa đơn.");
        System.out.println("4. Xóa hóa đơn.");
        System.out.println("5. Kết thúc.");
        return sc.nextLine();
    }

    public static void showDanhSach() {
        if (soHD == 0) {
            System.out.println("Danh sách hóa đơn rỗng !");
        } else {
            for(int i = 0; i < soHD; ++i) {
                System.out.print("\n-------Biên lai " + (i + 1) + "--------");
                dsHoaDon[i].show();
            }
        }

    }

    public static void nhapHD() {
        HoaDon hoaDon = new HoaDon();
        hoaDon.nhap();
        themHD(hoaDon);
        showDanhSach();
    }

    public static void themHD(HoaDon hoaDon) {
        dsHoaDon[soHD] = hoaDon;
        ++soHD;
    }

    public static void suaHD() {
        while(true) {
            System.out.println("Bạn muốn sửa hóa đơn số: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input != 0 && input <= soHD) {
                dsHoaDon[input - 1].nhap();
                return;
            }

            System.out.println("Không có số hóa đơn hợp lệ: ");
        }
    }

    public static void xoaHD() {
        while(true) {
            System.out.println("Bạn muốn xóa hóa đơn số: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input != 0 && input <= soHD) {
                --input;

                for(int i = 0; i < soHD; ++i) {
                    if (i >= input) {
                        dsHoaDon[i] = dsHoaDon[i + 1];
                    }
                }

                --soHD;
                return;
            }

            System.out.println("Không có số hóa đơn hợp lệ: ");
        }
    }
}
