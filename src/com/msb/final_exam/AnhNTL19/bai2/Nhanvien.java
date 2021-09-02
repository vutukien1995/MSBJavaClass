package com.msb.final_exam.AnhNTL19.bai2;

import java.util.Scanner;

public class Nhanvien {
    private String ten;
    private int tuoi;
    private String chucVu;
    private int kpi;
    private Phongban phongBan;

    public Nhanvien() {
    }

    public Nhanvien(String ten, int tuoi, String chucVu, int kpi, Phongban phongBan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.chucVu = chucVu;
        this.kpi = kpi;
        this.phongBan = phongBan;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getChucvu() {
        return this.chucVu;
    }

    public void setChucvu(String chucvu) {
        this.chucVu = chucvu;
    }

    public int getKpi() {
        return this.kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }

    public Phongban getPhongBan() {
        return this.phongBan;
    }

    public void setPhongBan(Phongban phongBan) {
        this.phongBan = phongBan;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho tên nhân viên: ");
        this.ten = sc.nextLine();
        System.out.println("Tuổi: ");
        this.tuoi = sc.nextInt();
        System.out.println("KPI: ");
        this.kpi = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Chức vụ: ");
        this.chucVu = sc1.nextLine();
    }

    public void show() {
        System.out.print("\nTên nhân viên: " + this.ten);
        System.out.print("\nTuổi nhân viên: " + this.tuoi);
        System.out.print("\nChức vụ nhân viên: " + this.chucVu);
        System.out.print("\nKPI của nhân viên: " + this.kpi);
        System.out.print("\nPhòng ban của nhân viên: " + this.phongBan.getTenPB());
    }
}
