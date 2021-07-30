package com.msb.lesson9.lananhntl19.bai4;

import java.util.Scanner;

public class SanPham {
    private String maSP;
    private double gia;
    private int soLuong;
    private double thanhTien;

    public SanPham() {
    }

    public SanPham(String maSP, double gia, int soLuong) {
        this.maSP = maSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.thanhTien = gia * (double)soLuong;
    }

    public void show() {
        System.out.print("\nGiá sản phẩm: " + this.gia);
        System.out.print("\nSố lượng sản phẩm: " + this.soLuong);
        System.out.print("\nThành tiền: " + this.thanhTien);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá thành sản phẩm: ");
        this.gia = (double)sc.nextInt();
        System.out.print("Nhập số lượng sản phẩm: ");
        this.soLuong = sc.nextInt();
    }

    public String getMaSP() {
        return this.maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public double getGia() {
        return this.gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return this.soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return this.thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }
}
