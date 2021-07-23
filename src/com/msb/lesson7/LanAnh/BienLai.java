package com.msb.lesson7.LanAnh;

/**
 * @author kienvt2
 */
public class BienLai {
    private BienLai[] bienLai;
    private int maBL;
    private KhachHang khachHang;
    private int soDienCu;
    private int soDienMoi;
    private float soTienPhaiTra;

    public KhachHang getKhachHang() {
        return this.khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public BienLai(int maBL, KhachHang khachHang, int soDienCu, int soDienMoi) {
        this.maBL = maBL;
        this.khachHang = khachHang;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.soTienPhaiTra = soTienPhaiTra;

        this.soTienPhaiTra = (soDienMoi - soDienCu)*5;
    }

    public BienLai[] getBienLai() {
        return this.bienLai;
    }

    public void setBienLai(BienLai[] bienLai) {
        this.bienLai = bienLai;
    }

    public int getMaBL() {
        return this.maBL;
    }

    public void setMaBL(int maBL) {
        this.maBL = maBL;
    }

    public BienLai() {
        this.maBL = 0;
        this.bienLai = new BienLai[100];
    }

    public void themBL(BienLai bienLai) {
        this.bienLai[this.maBL] = bienLai;
        ++this.maBL;
    }

    public void hienBienLai() {
        for(int i = 0; i < this.maBL; ++i) {
            System.out.println(this.bienLai[i].getKhachHang() + "\n4.Số điện cũ: " + this.bienLai[i].getSoDienCu() + "\n5.Sô điện mới: " + this.bienLai[i].getSoDienMoi() + "\n6.Số tiền phải trả: " + this.bienLai[i].getSoTienPhaiTra());
        }

    }

    public int getSoDienCu() {
        return this.soDienCu;
    }

    public void setSoDienCu(int soDienCu) {
        this.soDienCu = soDienCu;
    }

    public int getSoDienMoi() {
        return this.soDienMoi;
    }

    public void setSoDienMoi(int soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public float getSoTienPhaiTra() {
        return this.soTienPhaiTra;
    }

    public void setSoTienPhaiTra(float soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }
}
