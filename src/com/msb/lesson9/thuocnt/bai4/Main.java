package com.msb.lesson9.thuocnt.bai4;

import java.util.Scanner;

public class Main {
	
	static HoaDon[] hoaDons = new HoaDon[100];
	static int soHoaDon;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số hóa đơn: ");
		soHoaDon = sc.nextInt();
		if (soHoaDon == 0) {
			System.out.println("Số hóa đơn không hợp lệ. Mời bạn nhập lại số hóa đơn");
			soHoaDon = sc.nextInt();
		}
		for(int i = 0; i<soHoaDon; i++) {
			hoaDons[i] = new HoaDon();
			hoaDons[i].nhap();
		}
		
		// Console:
        boolean isExit = true;
        while (isExit) {
            switch (menu()) {
                case "1":
                    showDanhSach();
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
                    System.out.println("Nhập trong menu (1-5)");
            }
        }

	}
	
	public static String menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Show DS hóa đơn.");
        System.out.println("2. Thêm hóa đơn.");
        System.out.println("3. Sửa hóa đơn.");
        System.out.println("4. Xóa hóa đơn.");
        System.out.println("5. Kết thúc.");
        return sc.nextLine();
	}
	
	public static void showDanhSach() {
		for(int i = 0; i<soHoaDon; i++) {
			hoaDons[i].show();
			System.out.println();
		}
	}
	public static void themHoaDon() {
		hoaDons[soHoaDon] = new HoaDon();
		hoaDons[soHoaDon].nhap();
		soHoaDon++;
		
	}
	
	public static void suaHoaDon() {
		System.out.println("Bạn muốn sửa hóa đơn số: ");
		Scanner sc = new Scanner(System.in);
		int sohoadonsua = sc.nextInt();
		if(sohoadonsua == 0 || sohoadonsua > soHoaDon) {
			System.out.println("Số hóa đơn sửa không hợp lệ");
		} else {
			hoaDons[sohoadonsua-1].nhap();
		}
	}
	
	public static void xoaHoaDon() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Số hóa đơn muốn xóa: ");
		int soHoaDonxoa = sc.nextInt();
		if (soHoaDonxoa <= soHoaDon) {
			for (int i = soHoaDonxoa-1; i<soHoaDon; i++) {
				hoaDons[i] = hoaDons[i+1];
			}
			soHoaDon--;
		} else {
			System.out.println("Số hóa đơn xóa không hợp lệ");
		}
	}
}
