package com.msb.final_exam.ThuocNT.bai2;
import java.util.Scanner;

//Thông tin về nhân viên: tên, tuổi, chức vụ, kpi, phòng ban
public class NhanVien {
	private String tenNV;
	private int tuoi;
	private String cv;
	private int kpi;
	private PhongBan phongBan;
	
	public NhanVien()	{
		super();
	}
	public NhanVien(String tenNV, int tuoi, String cv, int kpi, PhongBan phongBan) {
		super();
		this.tenNV = tenNV;
		this.tuoi = tuoi;
		this.cv = cv;
		this.kpi = kpi;
		this.phongBan = phongBan;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getcv() {
		return cv;
	}
	public void setcv(String cv) {
		this.cv = cv;
	}
	public int getKpi() {
		return kpi;
	}
	public void setKpi(int kpi) {
		this.kpi = kpi;
	}
	public PhongBan getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ho tên nhân viên: ");
		tenNV = sc.nextLine();
		System.out.println("Tuổi: ");
		tuoi = sc.nextInt();
		
		System.out.println("KPI: ");
		kpi = sc.nextInt();		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Chức vụ: ");
		cv = sc1.nextLine();	
		
	}
	
	public void show() {			
		System.out.println("Nhân viên: "+ tenNV +" -Tuổi: "+ tuoi + " - Chức vụ: "+ cv +" - KPI: "+ kpi+ "- Phòng: "+phongBan.getTenPhong());
	}
	
	
	
	
	
	
	

}
