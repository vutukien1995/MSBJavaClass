package com.msb.lesson9.thuocnt.bai4;
import java.util.Scanner;

public class HoaDon {
	private String maHD;
	private String tenKH;
	private SanPham sanPham;
	public HoaDon(String maHD, String tenKH, SanPham sanPham) {
		super();
		this.maHD = maHD;
		this.tenKH = tenKH;
		this.sanPham = sanPham;
	}
	
	public HoaDon() {}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public SanPham getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mã hóa đơn: ");
		maHD = sc.nextLine();
		System.out.println("Tên Khách Hàng: ");
		tenKH = sc.nextLine();
		this.sanPham = new SanPham();
		sanPham.nhap();
		
	}

	
	public void show() {
		System.out.print( "HoaDon [maHD=" + maHD + ", tenKH=" + tenKH + "]");
		sanPham.show();
	}
	
	
	
}
