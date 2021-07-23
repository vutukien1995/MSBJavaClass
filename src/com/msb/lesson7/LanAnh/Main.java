package com.msb.lesson7.LanAnh;

/**
 * @author kienvt2
 */
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        KhachHang KH1 = new KhachHang("Lan Anh", "số 73 Hoàng Ngân", "01");
        KhachHang KH2 = new KhachHang("Long", "số 1 Nguyễn Thị Định", "02");
        KhachHang KH3 = new KhachHang("Phượng", "số 97 ngõ 48/36 Hoàng Ngân", "03");
        BienLai BL1 = new BienLai(1, KH1, 54, 88);
        BienLai BL2 = new BienLai(2, KH2, 46, 70);
        BienLai BL3 = new BienLai(3, KH3, 65, 90);
        BienLai bienLai = new BienLai();
        bienLai.themBL(BL1);
        bienLai.themBL(BL2);
        bienLai.themBL(BL3);
        bienLai.hienBienLai();
    }
}
