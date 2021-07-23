package com.msb.lesson7.Sample.bai2;

import java.util.Scanner;

/**
 * @author kienvt2
 */
public class KhachHang {

    private String hoVaTenChuHo;
    private String diaChi;
    private String maCongTo;

    public KhachHang() {
    }

    public KhachHang(String hoVaTenChuHo, String diaChi, String maCongTo) {
        this.hoVaTenChuHo = hoVaTenChuHo;
        this.diaChi = diaChi;
        this.maCongTo = maCongTo;
    }

    public void show () {
        System.out.println("Chủ hộ: "+ hoVaTenChuHo + " - Địa chỉ: " + diaChi + " - Mã công tơ: " + maCongTo);
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Họ tên chủ hộ: ");
        hoVaTenChuHo = sc.nextLine();
        System.out.println("Địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.println("Mã công tơ: ");
        maCongTo = sc.nextLine();
    }

    public String getHoVaTenChuHo() {
        return hoVaTenChuHo;
    }

    public void setHoVaTenChuHo(String hoVaTenChuHo) {
        this.hoVaTenChuHo = hoVaTenChuHo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }
}
