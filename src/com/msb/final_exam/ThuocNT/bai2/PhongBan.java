package com.msb.final_exam.ThuocNT.bai2;
//Thông tin về phòng ban bao gồm: tên phòng ban, địa chỉ, số lượng nhân viên.
public class PhongBan {
	private String tenPhong;
	private String điaChi;
	private int soLuongNV;
	
	public PhongBan(String tenPhong, String điaChi) {
		super();
		this.tenPhong = tenPhong;
		this.điaChi = điaChi;
	}

	public PhongBan() {
		super();
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getĐiaChi() {
		return điaChi;
	}

	public void setĐiaChi(String điaChi) {
		this.điaChi = điaChi;
	}

	public int getSoLuongNV() {
		return soLuongNV;
	}

	public void setSoLuongNV(int soLuongNV) {
		this.soLuongNV = soLuongNV;
	}
	public void tangSoLuongNV() {
		soLuongNV++;
		this.setSoLuongNV(soLuongNV);
	}

	public void show() {
		System.out.println("PhongBan [tenPhong=" + tenPhong + ", điaChi=" + điaChi + ", soLuongNV=" + soLuongNV + "]");
	}
	
	
	

}
