package com.msb.lesson7.Tannt9;
import java.util.Scanner;

public class KHvaBill {
	private String chuHo;
	private String soNha;
	private String maSoCongTo;
 
	private int chiSoCu;
	private int chiSoMoi;
	private int soTienPhaiTra; //(số mới – số cũ ) * 5.
	
	  
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên chủ hộ sử dụng điện: ");
		chuHo = sc.nextLine();
		
		System.out.println("Nhập số nhà: ");
		soNha = sc.nextLine();
		
		System.out.println("Nhập mã số công tơ điện: ");
		maSoCongTo = sc.nextLine();
		
		System.out.println("Nhập chỉ số cũ: ");
		chiSoCu = sc.nextInt();
		
		System.out.println("Nhập chỉ số mới: ");
		chiSoMoi = sc.nextInt();
		if(chiSoMoi <chiSoCu) {
			System.out.println("Chỉ số mới phải lớn hơn hoặc bằng chỉ số cũ. Vui lòng nhập lại!");
			}
		else {
				soTienPhaiTra = (chiSoMoi - chiSoCu) * 5;
		}
		
		}

	public void hienThongTin() {
		System.out.println("- Chủ hộ: "+ chuHo);
		System.out.println("- Số nhà: " + soNha);
		System.out.println("- Mã số Công tơ điện: " + maSoCongTo);
		System.out.println("- Chỉ số cũ: " + chiSoCu);
		System.out.println("- Chỉ số mới: " + chiSoMoi);
		System.out.println("- Số tiền phải trả: " + soTienPhaiTra);
	}

	public String getChuHo() {
		return chuHo;
	}

	public void setChuHo(String chuHo) {
		this.chuHo = chuHo;
	}

	public String getSoNha() {
		return soNha;
	}

	public void setSoNha(String soNha) {
		this.soNha = soNha;
	}

	public String getMaSoCongTo() {
		return maSoCongTo;
	}

	public void setMaSoCongTo(String maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}

	public int getChiSoCu() {
		return chiSoCu;
	}

	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}

	public int getChiSoMoi() {
		return chiSoMoi;
	}

	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}

	public int getSoTienPhaiTra() {
		return soTienPhaiTra;
	}

	public void setSoTienPhaiTra(int soTienPhaiTra) {
		this.soTienPhaiTra = soTienPhaiTra;
	}


	
}
