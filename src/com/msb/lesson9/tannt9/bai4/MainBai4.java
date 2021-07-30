package com.msb.lesson9.tannt9.bai4;

import java.util.Scanner;

public class MainBai4 {
	static SanPham[] SanPhams = new SanPham[100];
	static int SoCTHD = 0; // số chi tiết hóa đơn

	public static void main(String[] args) {
		// Tạo sẵn 2 bản ghi trong mảng
		HoaDon hd1 = new HoaDon("HD001", "Nguyễn Thị A", "Bánh gạo");
		SanPham sp1 = new SanPham("SP001", 10000, 5);
		sp1.setHoaDon(hd1);
		themCTHD(sp1);

		// Hiển thị menu:
		boolean isExit = true;
		while (isExit) {
			switch (menu()) {
			case "1":
				hienDSHoaDon();
				break;
			case "2":
				themHoaDon();
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
				System.out.println("Nhập số của 1 trong các menu sau:");
			}

		}
	}

	//Thêm chi tiết hóa đơn
	public static void themCTHD(SanPham sanPham) {
		SanPhams[SoCTHD] = sanPham;
		SoCTHD++;
	}

	//Menu
	public static String menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("MENU");
		System.out.println("1. Hiển thị DS Hóa đơn");
		System.out.println("2. Thêm Hóa đơn");
		System.out.println("3. Sửa Hóa đơn");
		System.out.println("4. Xóa Hóa đơn");
		System.out.println("5. Kết thúc.");
		return sc.nextLine();
	}

	// menu 1. Hiển thị DS Hóa đơn
	public static void hienDSHoaDon() {
		if (SoCTHD == 0) {
			System.out.println("Chưa có hóa đơn nào!");
		} else {
			for (int i = 0; i < SoCTHD; i++) {
				System.out.println("- Hóa đơn " + (i + 1) + ": ");
				SanPhams[i].in();
			}
		}
	}

	// menu 2. Thêm hóa đơn
	public static void themHoaDon() {
		SanPham sanPham = new SanPham();
		sanPham.nhap();
		themCTHD(sanPham);
		hienDSHoaDon();
	}

	// menu 3. Sửa hóa đơn
	public static void suaHoaDon() {
		while (true) {
			System.out.println("Bạn muốn sửa hóa đơn số: ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 0 || input > SoCTHD) {
				System.out.println("Số hóa đơn không đúng ");
			} else {
				SanPhams[input - 1].nhap();
				break;
			}
		}
	}

	//menu 4. Xóa hóa đơn
	public static void xoaHoaDon() {
		while (true) {
			System.out.println("Bạn muốn xóa hóa đơn số: ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			if (input == 0 || input > SoCTHD) {
				System.out.println("Không có số hóa đơn này! ");
			} else {
				input = input - 1;
				for (int i = 0; i < SoCTHD; i++) {
					if (i >= input) {
						SanPhams[i] = SanPhams[i + 1];
					}
				}
				SoCTHD--;
				break;
			}
		}
	}

}
