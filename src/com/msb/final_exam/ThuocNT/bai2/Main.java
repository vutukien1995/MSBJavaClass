package com.msb.final_exam.ThuocNT.bai2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<PhongBan> phongBans = new ArrayList<PhongBan>();
	static ArrayList<NhanVien> nhanViens = new ArrayList<NhanVien>();
	static int sonhanvien;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhongBan phong1 = new PhongBan("Phòng Công nghệ","tầng 7, TNR 54 Nguyễn Chí Thanh");
		PhongBan phong2 = new PhongBan("Phòng Kinh doanh","tấng 29, TNR 54 Nguyễn Chí Thanh");
		PhongBan phong3 = new PhongBan("Phòng Nhân sự","tấng 30, TNR 54 Nguyễn Chí Thanh");
		
		phongBans.add(phong1);
		phongBans.add(phong2);
		phongBans.add(phong3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Số nhân viên: ");
		sonhanvien = sc.nextInt();
		if (sonhanvien == 0) {
			System.out.println("Số nhân viên không hợp lệ. Mời bạn nhập lại số nhân viên");
			sonhanvien = sc.nextInt();
		}
		
		for(int i = 0; i<sonhanvien; i++) {
			themNhanvien();
		}
		
		// Console:
        boolean isExit = true;
        while (isExit) {
            switch (menu()) {
                case "1":
                	showAllNV();
                    break;
                case "2":
                	themNhanvien();
                	sonhanvien++;
                    break;
                case "3":
                	editNV();
                    break;
                case "4":
                	deleteNV();
                    break;
                case "5":
                	showTheoPhong();
                    break;
                case "6":
                	showAverageKpi();
                    break;
                case "7":
                    isExit = false;
                    System.out.println("Kết thúc");
                    break;
                default:
                    System.out.println("Nhập trong menu (1-6)");
            }
        }
		
	}
	
	public static String menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Menu: ");
        System.out.println("1. Show DS Nhân viên.");
        System.out.println("2. Thêm Nhân Viên.");
        System.out.println("3. Sửa Nhân Viên.");
        System.out.println("4. Xóa Nhân viên.");
        System.out.println("5. Show DS Nhân viên theo phòng ban.");
        System.out.println("6. Trung Bình KPI theo phòng ban.");
        System.out.println("7. Kết thúc.");
        return sc.nextLine();
	}
	public static String menuPhong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn phòng cho nhân viên, nhập từ 1 đến 3: ");       
        int thutu = 1;
        for (PhongBan i : phongBans) {
        	System.out.println(thutu + ": "+ i.getTenPhong() );
            thutu++;
         }        
        return sc.nextLine();        
	}
	
	public static void showAllNV() {
		//DS nhân viên của cty
		System.out.println("Danh sách nhân viên công ty: ");
		int index=1;
		for (NhanVien nv : nhanViens) {
			System.out.print(index+". ");
        	nv.show();
        	index++;
          }
	}
	public static void themNhanvien() {
		NhanVien nv = new NhanVien();
		nv.nhap();
		boolean isExit = true;
        while (isExit) {
            switch (menuPhong()) {
                case "1":
                    nv.setPhongBan(phongBans.get(0));                   
                    isExit = false;
                    break;
                case "2":
                	nv.setPhongBan(phongBans.get(1));                	
                	isExit = false;
                    break;
                case "3":
                	nv.setPhongBan(phongBans.get(2));
                	isExit = false;
                    break;
                 default:
                    System.out.println("Nhập sai giá trị phòng ban, chỉ được nhập các số từ 1 đến 3");
                    break;
            }
        }
       nhanViens.add(nv);		
	}
	
	public static void showTheoPhong() {		
		//DS nhân viên của cty
		System.out.println("Danh sách nhân viên theo phòng: ");
		for (PhongBan phong : phongBans) {
			System.out.println(phong.getTenPhong());
			for (NhanVien nv : nhanViens) {					
				if (phong == nv.getPhongBan()) {
					nv.show();
				}
	          }
          }		
	}
	
	public static void editNV() {
		showAllNV();
		Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn sửa nhân viên thứ: ");
        int nhanvienso = sc.nextInt();
        nhanvienso--;
        System.out.println("Nhập thông tin mới cho nhân viên bạn muốn sửa: ");
        NhanVien nv = new NhanVien();
		nv.nhap();
		boolean isExit = true;
        while (isExit) {
            switch (menuPhong()) {
                case "1":
                    nv.setPhongBan(phongBans.get(0));
                    isExit = false;
                    break;
                case "2":
                	nv.setPhongBan(phongBans.get(1));
                	isExit = false;
                    break;
                case "3":
                	nv.setPhongBan(phongBans.get(2));
                	isExit = false;
                    break;
                 default:
                    System.out.println("Nhập sai giá trị phòng ban, chỉ được nhập các số từ 1 đến 3");
                    break;
            }
        }
        nhanViens.set(nhanvienso,nv);
        
	}
	
	public static void deleteNV() {
		showAllNV();
		Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn xóa nhân viên thứ: ");
        int nhanvienso = sc.nextInt();
        nhanvienso--;
        nhanViens.remove(nhanvienso);
        sonhanvien--;
	}
	
	public static void showAverageKpi() {
	
		for (PhongBan phong : phongBans) {
			float diemKpi = 0;
			int soNV = 0;
			for (NhanVien nv : nhanViens) {					
				if (phong == nv.getPhongBan()) {
					diemKpi = diemKpi + nv.getKpi();
					soNV++;
				}
	          }
			if(soNV > 0) {
				float trungbinh = diemKpi/soNV;
				System.out.println(phong.getTenPhong()+" điểm trung bình KPI: "+trungbinh);
			} else {
				System.out.println(phong.getTenPhong()+" chưa có nhân viên");
			}
         }
		
	}
	
}
