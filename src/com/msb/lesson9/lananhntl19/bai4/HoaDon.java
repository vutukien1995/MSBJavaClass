package com.msb.lesson9.lananhntl19.bai4;

import java.util.Scanner;

public class HoaDon {
    private int maDon;
    private String tenKH;
    private SanPham sanPham;

    public HoaDon() {
        this.sanPham = new SanPham();
    }

    public HoaDon(int maDon, String tenKH) {
        this.maDon = maDon;
        this.tenKH = tenKH;
        this.sanPham = new SanPham();
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        this.sanPham.nhap();
        System.out.println("Nhập mã hóa đơn: ");
        this.maDon = sc.nextInt();
        System.out.println("Nhập tên khách hàng: ");
        this.tenKH = sc.nextLine();
    }

    public void show() {
        this.sanPham.show();
        System.out.println("\nMã hóa đơn: " + this.maDon);
        System.out.println("Tên khách hàng: " + this.tenKH);
    }

    public int getMaDon() {
        return this.maDon;
    }

    public void setMaDon(int maDon) {
        this.maDon = maDon;
    }

    public String getTenKH() {
        return this.tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public SanPham getSanPham() {
        return this.sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }
}
