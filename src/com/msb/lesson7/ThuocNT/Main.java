package com.msb.lesson7.ThuocNT;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KhachHang kh1 = new KhachHang("Nguyễn Văn A", "Hoàng Mai", "MCT001");
		BienLai bienlaiKh1 = new BienLai(kh1, 100, 250);
		bienlaiKh1.tinhTienDien();
		System.out.println("So tien phai tra của KH "+kh1.getHotenchuho()+" là:"+bienlaiKh1.getTiendien());

	}

}
