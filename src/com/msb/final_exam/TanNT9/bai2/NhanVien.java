package com.msb.final_exam.TanNT9.bai2;

import java.util.Scanner;

public class NhanVien {
    private PhongBan phongBan;
    private String hoTen;
    private int tuoi;
    private String chucVu;
    private int KPI;

    public NhanVien() {
        this.phongBan = new PhongBan();
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getChucVu() {
        return this.chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getKPI() {
        return this.KPI;
    }

    public void setKPI(int kPI) {
        this.KPI = kPI;
    }

    public PhongBan getPhongBan() {
        return this.phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public NhanVien(String hoTen, int tuoi, String chucVu, int kPI) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.chucVu = chucVu;
        this.KPI = kPI;
        this.phongBan = new PhongBan();
    }

    public void nhapNhanVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Nhập họ tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("- Nhập tuổi: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("- Nhập chức vụ: ");
        this.chucVu = sc.nextLine();
        System.out.println("- Nhập KPI: ");
        this.KPI = sc.nextInt();
        System.out.println("- Nhập số phòng ban trong Danh sách sau:");
    }

    public void showNhanVien() {
        System.out.print("\t" + this.hoTen + " - " + this.tuoi + " tuổi" + " - " + this.chucVu + " - " + this.KPI + " - ");
        this.phongBan.showPhongBan();
    }

    public void showNhanVien1() {
        System.out.print("\t" + this.hoTen + " - " + this.tuoi + " tuổi" + " - " + this.chucVu + " - " + this.KPI);
    }
}
