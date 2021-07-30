// Bai 4
package com.msb.lesson9.luyenlt1.bai4;

import java.util.Scanner;

public class HoaDon {
	private SanPham sanPham;
	private String maHD;
	private String tenKH;	
	
	public HoaDon() {
        this.sanPham = new SanPham();
    }
	
	public HoaDon (String maHD, String tenKH) {
		this.maHD = maHD;
		this.tenKH = tenKH;
		this.sanPham = new SanPham();
		}
	
	public void show () {
		sanPham.show();
        System.out.println("Mã hóa đơn: " + maHD + " - Tên KH: " + tenKH );
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        sanPham.nhap();

        System.out.println("Mã hóa đơn: ");
        maHD = sc.nextLine();
        System.out.println("Tên KH: ");
        tenKH = sc.nextLine();
    }

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
	
	
}
