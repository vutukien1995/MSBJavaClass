// Bai 4
package com.msb.lesson9.luyenlt1.bai4;
import java.util.Scanner;
public class Main {
static HoaDon[] hoaDons = new HoaDon[1000];
    static int soHoaDon = 0;

    public static void main(String[] args) {
        // Khởi tạo hoa don:
        HoaDon hoaDons1 = new HoaDon("HD1", "HD Táo");
        SanPham sanPham1 = new SanPham("Táo", 30000, 3);
        hoaDons1.setSanPham(sanPham1);
        themHoaDon(hoaDons1);

        HoaDon hoaDons2 = new HoaDon("HD2", "HD Ổi");
        SanPham sanPham2 = new SanPham("Ổi", 50000, 5);
        hoaDons2.setSanPham(sanPham2);
        themHoaDon(hoaDons2);

        // Console:
        boolean isExit = true;
        while (isExit) {
            switch (menu()) {
                case "1":
                    showDanhSach();
                    break;
                case "2":
                    nhapHoaDon();
                    break;
                case "3":
                    suaHoaDon();
                    break;
                case "4":
                    xoaHoaDon();
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
        System.out.println("1. Show DS Hóa đơn.");
        System.out.println("2. Thêm Hóa đơn.");
        System.out.println("3. Sửa Hóa đơn.");
        System.out.println("4. Xóa BHóa đơn.");
        System.out.println("5. Kết thúc.");
        return sc.nextLine();
    }

    public static void showDanhSach() {
        if (soHoaDon == 0) {
            System.out.println("Danh sách hóa đơn rỗng !");
        } else {
            for(int i = 0; i<soHoaDon; i++) {
                System.out.println("- Biên lai " + (i+1) + ": ");
                hoaDons[i].show();
            }
        }
    }

    public static void nhapHoaDon(){
        HoaDon hoaDon = new HoaDon();
        hoaDon.nhap();
        themHoaDon(hoaDon);
        showDanhSach();
    }

    public static void themHoaDon(HoaDon hoaDon) {
        hoaDons[soHoaDon] = hoaDon;
        soHoaDon++;
    }

    // Sua hoa don
    public static void suaHoaDon() {
        while (true) {
            System.out.println("Bạn muốn sửa hóa đơn số: ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0 || input > soHoaDon) {
                System.out.println("Không có số hóa đơn hợp lệ: ");
            } else {
                hoaDons[input-1].nhap();
                break;
            }
        }
    }
    
    // Xoa hoa don

    public static void xoaHoaDon() {
        while (true) {
            System.out.println("Bạn muốn xóa hóa đơn số: ");

            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input == 0 || input > soHoaDon) {
                System.out.println("Không có số hóa đơn hợp lệ: ");
            } else {
                input = input-1;
                for(int i = 0; i<soHoaDon; i++){
                    if(i >= input) {
                        hoaDons[i] = hoaDons[i+1];
                    }
                }
                soHoaDon--;
                break;
            }
        }
    }

}


