package com.msb.lesson7.chamhtp2.bai2;

import java.util.Scanner;

public class BienLai {
	
	private int soDienCu;
	private int soDienMoi;
	private double tienPhaiTra;
	private KhachHang khachHang;
	
	// Contractor
	public BienLai() {
		super();
	}

	public BienLai(int soDienCu, int soDienMoi, int tienPhaiTra) {
		super();
		this.soDienCu = soDienCu;
		this.soDienMoi = soDienMoi;
		this.tienPhaiTra = tienPhaiTra;
	}
	

	public int getSoDienCu() {
		return soDienCu;
	}

	public void setSoDienCu(int soDienCu) {
		this.soDienCu = soDienCu;
	}

	public int getSoDienMoi() {
		return soDienMoi;
	}

	public void setSoDienMoi(int soDienMoi) {
		this.soDienMoi = soDienMoi;
	}

	public double getTienPhaiTra() {
		return tienPhaiTra;
	}

	public void setTienPhaiTra(double tienPhaiTra) {
		this.tienPhaiTra = tienPhaiTra;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	//Phương thức nhập thông tin Biên lai
	public void nhapThongTinBienLai() {
		khachHang = new KhachHang();
		khachHang.nhapThongTinKhachHang();
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Nhập thông tin chỉ Số điện Cũ: ");
		soDienCu=sc.nextInt();
	    sc.nextLine();
	    System.out.println("Nhập thông tin chỉ Số điện Mới: ");
		soDienMoi=sc.nextInt();
	    sc.nextLine();
		}
		while (soDienCu > soDienMoi);
		tienPhaiTra = (soDienMoi - soDienCu)*5;
	}
	
	//Phương thức xuất thông tin Biên lai
	public void xuatThongTinBienLai() {
		System.out.println("=====================Thông tin Biên lai Khách hàng========================");
		khachHang.xuatThongTinKhachHang();
		System.out.println("Số điện cũ: "+ soDienCu);
		System.out.println("Số điện mới: "+ soDienMoi);
		System.out.println("Số tiền phải trả: "+ tienPhaiTra);
		
	}
	
}
