package com.msb.lesson9.chamhtp2.bai4;

import java.util.Scanner;

/**
 * @author chamhtp2
 */

public class Main {

	static DonHang[] donHangs = new DonHang[1000];
	static int soDonHang = 0;

	public static void main(String[] args) {
		// Khởi tạo:
		DonHang donHang1 = new DonHang("DH10001", "Hoàng Thị Phương Châm");
		SanPham sanPham1 = new SanPham("SPA01", 300000, 2);
		donHang1.setSanPham(sanPham1);
		themDonHang(donHang1);

		DonHang donHang2 = new DonHang("DH10002", "Nguyễn Thị Bích");
		SanPham sanPham2 = new SanPham("SPA05", 500000, 4);
		donHang2.setSanPham(sanPham2);
		themDonHang(donHang2);

		// Console:
		boolean isExit = true;
		while (isExit) {
			switch (menu()) {
			case "1":
				showDanhSach();
				break;
			case "2":
				nhapDonHang();
				break;
			case "3":
				suaDonHang();
				break;
			case "4":
				xoaDonHang();
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
		System.out.println("1. Show DS Đơn Hàng.");
		System.out.println("2. Thêm Đơn Hàng.");
		System.out.println("3. Sửa Đơn Hàng.");
		System.out.println("4. Xóa Đơn Hàng.");
		System.out.println("5. Kết thúc.");
		return sc.nextLine();
	}

	public static void showDanhSach() {
		if (soDonHang == 0) {
			System.out.println("Danh sách hóa đơn rỗng !");
		} else {
			for (int i = 0; i < soDonHang; i++) {
				System.out.println("- Hóa đơn " + (i + 1) + ": ");
				donHangs[i].show();
			}
		}
	}

	public static void nhapDonHang() {
		DonHang donHang = new DonHang();
		donHang.nhap();
		themDonHang(donHang);
		showDanhSach();
	}

	public static void themDonHang(DonHang donHang) {
		donHangs[soDonHang] = donHang;
		soDonHang++;
	}

	public static void suaDonHang() {
		while (true) {
			System.out.println("Bạn muốn sửa đơn hàng số: ");

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 0 || input > soDonHang) {
				System.out.println("Không có số đơn hàng hợp lệ: ");
			} else {
				donHangs[input - 1].nhap();
				break;
			}
		}
	}

	public static void xoaDonHang() {
		while (true) {
			System.out.println("Bạn muốn xóa biên lai số: ");

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 0 || input > soDonHang) {
				System.out.println("Không có số biên lai hợp lệ: ");
			} else {
				input = input - 1;
				for (int i = 0; i < soDonHang; i++) {
					if (i >= input) {
						donHangs[i] = donHangs[i + 1];
					}
				}
				soDonHang--;
				break;
			}
		}
	}

}
