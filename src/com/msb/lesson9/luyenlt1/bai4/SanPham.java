// Bai 4
package com.msb.lesson9.luyenlt1.bai4;

import java.util.Scanner;

public class SanPham {
	private String maSP;
	private int bangGia;
	private int soLuong;
	private int thanhTien;
	
	public SanPham() {
    }

    public SanPham (String maSP, int bangGia, int soLuong) {
        this.maSP = maSP;
        this.bangGia = bangGia;
        this.soLuong = soLuong;
        thanhTien = bangGia*soLuong;
    }

    public void show () {
        System.out.println("Ma san pham: "+ maSP + " - Bang gia: " + bangGia + " - So luong: " + soLuong + " - Thanh tien: " + thanhTien);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma san pham: ");
        maSP = sc.nextLine();
        System.out.println("Bang gia: ");
        bangGia = sc.nextInt();
        System.out.println("So luong: ");
        soLuong = sc.nextInt();
        
        thanhTien = bangGia*soLuong;
    }
	
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public int getBangGia() {
		return bangGia;
	}
	public void setBangGia(int bangGia) {
		this.bangGia = bangGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
	

}
