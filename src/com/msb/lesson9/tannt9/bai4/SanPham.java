package com.msb.lesson9.tannt9.bai4;

import java.util.Scanner;

public class SanPham {
	private HoaDon hoaDon;
	private String maSP;
	private int giaSP;
	private int soLuongSP;
	private int thanhTien;

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public int getGiaSP() {
		return giaSP;
	}

	public void setGiaSP(int giaSP) {
		this.giaSP = giaSP;
	}

	public int getSoLuongSP() {
		return soLuongSP;
	}

	public void setSoLuongSP(int soLuongSP) {
		this.soLuongSP = soLuongSP;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}

	// Tính tiền cho hóa đơn
	public SanPham(String maSP, int giaSP, int soLuongSP) {
		this.maSP = maSP;
		this.giaSP = giaSP;
		this.soLuongSP = soLuongSP;
		this.hoaDon = new HoaDon();
		thanhTien = giaSP * soLuongSP;
	}

	public SanPham() {
		this.hoaDon = new HoaDon();// TODO Auto-generated constructor stub
	}

	// Nhập thông tin hóa đơn & thông tin hàng hóa của hóa đơn
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		hoaDon.nhap();
		System.out.println("Nhập mã sản phẩm: ");
		maSP = sc.nextLine();
		System.out.println("Nhập đơn giá sản phẩm: ");
		giaSP = sc.nextInt();
		System.out.println("Nhập số lượng sản phẩm: ");
		soLuongSP = sc.nextInt();
		thanhTien = giaSP * soLuongSP;

	}

	public void in() {
		hoaDon.in();
		System.out.println("Mã sản phẩm: " + maSP);
		System.out.println("Giá: " + giaSP + " - Số lượng: " + soLuongSP);
		System.out.println("Thành tiền: " + thanhTien);
	}

}
