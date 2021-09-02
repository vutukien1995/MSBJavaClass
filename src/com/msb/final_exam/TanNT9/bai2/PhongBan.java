package com.msb.final_exam.TanNT9.bai2;

public class PhongBan {
    private String tenPhong;
    private String diaChi;
    private int soLuongNV;

    public PhongBan() {
    }

    public String getTenPhong() {
        return this.tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getDiaChi() {
        return this.diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoLuongNV() {
        return this.soLuongNV;
    }

    public void setSoLuongNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
    }

    public PhongBan(String tenPhong, String diaChi) {
        this.tenPhong = tenPhong;
        this.diaChi = diaChi;
    }

    public void showPhongBan() {
        System.out.println("\t" + this.tenPhong);
    }
}