package com.msb.lesson9.chamhtp2.bai4;

import java.util.Scanner;

/**
 * @author chamhtp2
 */

public class DonHang {
	private SanPham sanPham;
	private String maDon;
	private String tenKH;

	public DonHang() {
		this.sanPham = new SanPham();
	}

	public DonHang(String maDon, String tenKH) {
		this.maDon = maDon;
		this.tenKH = tenKH;
		this.sanPham = new SanPham();

	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}

	public String getMaDon() {
		return maDon;
	}

	public void setMaDon(String maDon) {
		this.maDon = maDon;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		sanPham.nhap();

		System.out.println("Mã đơn: ");
		maDon = sc.nextLine();
		System.out.println("Tên khách hàng: ");
		tenKH = sc.nextLine();
	}

	public void show() {
		sanPham.show();
		System.out.println("Mã đơn: " + maDon + ", Tên khách hàng: " + tenKH);
	}

}
