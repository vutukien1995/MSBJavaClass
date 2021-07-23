package com.msb.lesson7.chamhtp2.bai2;

import java.util.Scanner;

public class KhachHang {
	private String hoTenChuHo;
	private int soNha;
	private int soCongToDien;

//Contractor
	public KhachHang() {
		super();
	}

	public KhachHang(String hoTenChuHo, int soNha, int soCongToDien) {
		super();
		this.hoTenChuHo = hoTenChuHo;
		this.soNha = soNha;
		this.soCongToDien = soCongToDien;
	}

// Getter & Setter

	public String getHoTenChuHo() {
		return hoTenChuHo;
	}

	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}

	public int getSoNha() {
		return soNha;
	}

	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}

	public int getSoCongToDien() {
		return soCongToDien;
	}

	public void setSoCongToDien(int soCongToDien) {
		this.soCongToDien = soCongToDien;
	}

	//Phương thức nhập thông tin KH
	public void nhapThongTinKhachHang() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên chủ hộ: ");
		hoTenChuHo=sc. nextLine();
		System.out.println("Nhập Số nhà: ");
		soNha=sc. nextInt();
		sc. nextLine();
		System.out.println("Nhập Số Công tơ điện: ");
		soCongToDien=sc. nextInt();
		sc. nextLine();
	}
	
	//Phương thức xuất thông tin KH
	public void xuatThongTinKhachHang() {
	System.out.println("Tên chủ hộ: " + hoTenChuHo);
	System.out.println("Số nhà: " + soNha );
	System.out.println("Nhập Số Công tơ điện: " + soCongToDien);
}
	
	
}
