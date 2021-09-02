package com.msb.final_exam.AnhNTL19.bai2;

public class Phongban {
    private String tenPB;
    private String diaChi;
    private int soLuongNV;

    public Phongban(String tenPB, String diaChi) {
        this.tenPB = tenPB;
        this.diaChi = diaChi;
    }

    public String getTenPB() {
        return this.tenPB;
    }

    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
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

    public void show() {
        System.out.print("\nTên phòng ban: " + this.tenPB);
        System.out.print("\nĐịa chỉ: " + this.diaChi);
        System.out.print("\nSố lượng nhân viên: " + this.soLuongNV);
    }
}
