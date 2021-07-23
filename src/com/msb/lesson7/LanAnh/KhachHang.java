package com.msb.lesson7.LanAnh;

/**
 * @author kienvt2
 */
public class KhachHang {
    private String hoTen;
    private String soNha;
    private String maSoCongTo;

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return this.soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaSoCongTo() {
        return this.maSoCongTo;
    }

    public void setMaSoCongTo(String maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    public KhachHang(String hoTen, String soNha, String maSoCongTo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String toString() {
        return "-------Thông tin khách hàng------\n1.Họ tên: " + this.hoTen + "\n2.Số nhà: " + this.soNha + "\n3.Mã công tơ điện: " + this.maSoCongTo;
    }
}
