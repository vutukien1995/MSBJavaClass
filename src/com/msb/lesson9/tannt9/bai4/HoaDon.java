/*
 * Bài 4: Viết chương trình quản lý hóa đơn bán hàng tại quầy.
Đơn hàng gồm các thông tin: mã đơn, tên khách hàng, sản phẩm mua hàng
Sản phẩm gồm các thông tin: mã sản phẩm, bảng giá, số lượng, thành tiền

a. Hãy xây dựng lớp HoaDon để lưu trữ thông tin hóa đơn.
b. Xây dựng lớp SanPham để lưu thông tin sản phẩm
c. Xây dựng các phương thức thêm, xóa, sửa các thông tin hóa đơn
d. Viết phương thức tính thành tiền = bảng giá*số lượng
(Mỗi hóa đơn có chỉ gồm 1 loại sản phẩm duy nhất)
 */
package com.msb.lesson9.tannt9.bai4;

import java.util.Scanner;

public class HoaDon {
	private String maHoaDon;
	private String tenKhachHang;
	private String sanPham;

	public HoaDon() {
	}

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public String getSanPham() {
		return sanPham;
	}

	public void setSanPham(String sanPham) {
		this.sanPham = sanPham;
	}

	public HoaDon(String maHoaDon, String tenKhachHang, String sanPham) {
		super();
		this.maHoaDon = maHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.sanPham = sanPham;
	}

	// Nhập thông tin hóa đơn
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã hóa đơn: ");
		maHoaDon = sc.nextLine();
		System.out.println("Nhập tên khách hàng: ");
		tenKhachHang = sc.nextLine();
		System.out.println("Nhập sản phẩm: ");
		sanPham = sc.nextLine();
	}

	// In thông tin hóa đơn
	public void in() {
		System.out.println("Hóa đơn: " + maHoaDon + " - Khách hàng: " + tenKhachHang);
		System.out.println("Sản phẩm mua: " + sanPham);
	}

}
