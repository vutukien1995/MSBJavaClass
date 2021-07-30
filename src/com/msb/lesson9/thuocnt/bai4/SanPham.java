package com.msb.lesson9.thuocnt.bai4;
import java.util.Scanner;

public class SanPham {
	private String maSP;
	private float gia;
	private int soLuong;
	private float thanhTien;
	
	
	public SanPham(String maSP, float gia, int soLuong) {
		super();
		this.maSP = maSP;
		this.gia = gia;
		this.soLuong = soLuong;
		this.thanhTien = gia*soLuong;
	}
	public SanPham() {		
	}
	public String getMaSP() {
		return maSP;
	}
	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public float getThanhTien() {
		return thanhTien;
	}
	public void thanhTien(float gia, int soLuong) {
		this.thanhTien = gia*soLuong;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mã sản phẩm: ");
		maSP = sc.nextLine();
		System.out.println("Giá: ");
		gia = sc.nextFloat();
		System.out.println("Số lượng: ");
		soLuong = sc.nextInt();
		thanhTien = gia*soLuong;
			
	}

	public void show() {
		System.out.println("SanPham [maSP=" + maSP + ", gia=" + gia + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + "]");
	}
	
	
	
}
