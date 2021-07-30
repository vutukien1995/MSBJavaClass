package com.msb.lesson9.chamhtp2.bai4;

import java.util.Scanner;

/**
 * @author chamhtp2
 */

public class SanPham {
	private String maSP;
	private double bangGia;
	private int soLuong;
	private double thanhTien;

	public SanPham() {
	}

	public SanPham(String maSP, double bangGia, int soLuong) {
		this.maSP = maSP;
		this.bangGia = bangGia;
		this.soLuong = soLuong;
		thanhTien = (bangGia * soLuong);
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public double getBangGia() {
		return bangGia;
	}

	public void setBangGia(double bangGia) {
		this.bangGia = bangGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(double thanhTien) {
		this.thanhTien = thanhTien;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mã sản phẩm: ");
		maSP = sc.nextLine();
		System.out.println("Bảng giá: ");
		bangGia = sc.nextDouble();
		sc.nextLine();
		System.out.println("Số lượng: ");
		soLuong = sc.nextInt();
		sc.nextLine();
		thanhTien = (bangGia * soLuong);
	}

	public void show() {
		System.out.println("Sản Phẩm: " + maSP + ", Bảng giá: " + bangGia + ", Số lượng: " + soLuong + ", Thành tiền: "
				+ thanhTien);
	}
}
