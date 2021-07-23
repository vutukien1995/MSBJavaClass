package com.msb.lesson7.chamhtp2.bai2;

import java.util.Scanner;

public class Main {
	static final int MAX_BienLai = 10;
	static int bienLaiNumber;
	static BienLai[] bienLai;
	static int bienLaiNumberAdd;
	static Scanner sc = new Scanner(System.in);
	static int soKH;
	static KhachHang[] khachHang;
	
	static String printMenu()  {
		System.out.println("=================Menu===============");
		System.out.println("1. Khởi Tạo Biên Lai.");
		System.out.println("2. Hiển thị thông tin Biên lai mỗi hộ sử dụng điện.");
		System.out.println("3. Thêm thông tin riêng của mỗi hộ sử dụng điện");
		System.out.println("4. Tìm thông tin hộ gia đình.");
		System.out.println("5. Sửa thông tin riêng của mỗi hộ sử dụng điện");
		System.out.println("6. Xóa thông tin riêng của mỗi hộ sử dụng điện");
		System.out.println("7. Kết thúc");
		return sc.nextLine();		
	}
	
	// 1.Khởi tạo biên lai
	static void intBienLai() {
		do {
			System.out.print("Nhập vào tổng số Biên Lai: ");
			bienLaiNumber = sc.nextInt();
			if (bienLaiNumber > MAX_BienLai || bienLaiNumber < 1) {
				System.out.println("Tổng số Biên lai không hợp lệ!\n");
			}
		} while (bienLaiNumber > MAX_BienLai|| bienLaiNumber < 1);
		
		sc.nextLine();
		bienLai = new BienLai[bienLaiNumber];//Bổ sung thêm
		for (int i = 0; i < bienLaiNumber; i++) {
			bienLai[i] = new BienLai();
			System.out.println("Nhập thông tin biên lai của hộ gia đình thứ " + (i + 1) + ": ");
            bienLai[i].nhapThongTinBienLai();
		}
	}
	
	// 2.Hiển thị thông tin Biên lai
	static void hienThiBienLai() {
		System.out.println("Thông tin biên lai của các hộ gia đình: ");
        for (int i = 0; i < bienLaiNumber; i++) {
            System.out.println("Thông tin biên lai hộ gia đình thứ " + (i + 1) + ": ");
            bienLai[i].xuatThongTinBienLai();
		}
	}   
	
	// 3. Thêm biên lai
		static void themBienLai() {
			System.out.print("Nhập vào tổng số Biên Lai Thêm: ");
			bienLaiNumberAdd = sc.nextInt();
			sc.nextLine();
			bienLai = new BienLai[bienLaiNumberAdd];//Bổ sung thêm
			for (int i = 0; i < bienLaiNumberAdd; i++) {
				bienLai[i] = new BienLai();
				System.out.println("Nhập thông tin biên lai của hộ gia đình thứ " + (i + 1) + ": ");
	            bienLai[i].nhapThongTinBienLai();
			}
		}
	
	//4. Tìm kiếm thông tin Hộ gia đình sử dụng điện
	static void hienThiHoGDBySoNha() {
		if (bienLaiNumber <= 0) {
			System.out.println("Chưa nhập danh sách hộ gia đình sử dụng điện.");
		}else {
			System.out.println("Thông tin Hộ Gia Đình sử dụng điện cần tìm là:");
			String searchHoTenCH = sc.nextLine();
			//sc.nextLine();
			int count = 0;
			
			for (int i = 0; i < bienLaiNumber ; i++) {
				System.out.println("Tên chủ hộ:" + bienLai[i].getKhachHang().getHoTenChuHo());
				
				if (bienLai[i].getKhachHang().getHoTenChuHo().equalsIgnoreCase(searchHoTenCH))
				{
					count++;
					System.out.println("Thông tin hộ gia đình cần tìm là:");
					bienLai[i].xuatThongTinBienLai();
					
				  }
			}
			if (count == 0) {
				System.out.println("Không tìm thấy hộ gia đình!");
			}
		}
	}
     
	//5. Sửa thông tin riêng mỗi hộ gia đình	
	static void suaThongTinHoGD() {
		String ht;
		int sn;
		int sctd;
			
		for (int i = 0; i < bienLaiNumber; i++)
		{
			System.out.println("Nhập Họ tên chủ hộ mới: ");
			ht=sc. nextLine();
			
			bienLai[i].getKhachHang().setHoTenChuHo(ht);
			
			System.out.println("Nhập Số nhà mới: ");
			sn=sc. nextInt();
			sc. nextLine();
			bienLai[i].getKhachHang().setSoNha(sn);
			
			System.out.println("Nhập số công tơ mới: ");
			sctd= sc. nextInt();
			sc. nextLine();
			bienLai[i].getKhachHang().setSoCongToDien(sctd);	
		}
	}
	
     // Xóa thông tin KH	
	//	static void xoaThongTinHoGD(int n) {
	//		for (int i = 0; i < bienLaiNumber; i++)
	//			bienLai[i].remove();

	 //  } ------------------------------------Em chưa tìm thấy lệnh xóa

public static void main(String[] args) {
	boolean isExit = false;
	do {
		switch (printMenu()) {
		case "1":
			intBienLai();
			break;
		case "2":
			hienThiBienLai();
			break;
		case "3":
			themBienLai();
			break;
		case "4":
			hienThiHoGDBySoNha();
			break;
		case "5":
			suaThongTinHoGD();
			break;
	//	case "6":
	//		xoaThongTinHoGD();
	//		break;	
			
		case "7":
			isExit = true;
			break;
		default:
			System.out.println("Không phải menu hợp lệ (1-7).");
		}
	}while(!isExit);

}

}
