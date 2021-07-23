package com.msb.lesson7.Sample.bai2;


import java.util.Scanner;

/**
 * @author kienvt2
 */
public class BienLai {

    private KhachHang khachHang;
    private int soDienCu;
    private int soDienMoi;
    private int tienDien;

    public BienLai() {
        this.khachHang = new KhachHang();
    }

    public BienLai(int soDienCu, int soDienMoi) {
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.khachHang = new KhachHang();

        tienDien = (soDienMoi - soDienCu)*5;
    }

    public void show () {
        khachHang.show();
        System.out.println("Số điện cũ: " + soDienCu + " - Số điện mới: " + soDienMoi + " - Số tiền phải trả: " + tienDien);
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);

        khachHang.nhap();

        System.out.println("Số điện cũ: ");
        soDienCu = sc.nextInt();
        System.out.println("Số điện mới: ");
        soDienMoi = sc.nextInt();

        tienDien = (soDienMoi - soDienCu)*5;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
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

    public int getTienDien() {
        return tienDien;
    }

    public void setTienDien(int tienDien) {
        this.tienDien = tienDien;
    }
}
