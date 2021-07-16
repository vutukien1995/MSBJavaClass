package com.msb.lesson6;

public class TuyenSinh {

    private ThiSinh[] thiSinh;
    private int soThiSinh;

    public TuyenSinh () {
        soThiSinh = 0;
        this.thiSinh = new ThiSinh[100];
    }

    public void themThiSinh(ThiSinh thiSinh) {
        this.thiSinh[soThiSinh] = thiSinh;
        soThiSinh++;
    }

    public void hienThiSinh() {
        for(int i = 0; i<soThiSinh; i++) {
            System.out.println(thiSinh[i].getSoBaoDanh() + " - " + thiSinh[i].getHoTen() + " - "
                    + thiSinh[i].getDiaChi() + " - " + thiSinh[i].getMucUuTien() + " - " + thiSinh[i].getKhoi());
        }
    }

    public void timThiSinh(String maSo) {
        boolean checker = false;
        for(int i = 0; i<soThiSinh; i++) {
           if(thiSinh[i].getSoBaoDanh().equals(maSo)) {
               System.out.println(thiSinh[i].getSoBaoDanh() + " - " + thiSinh[i].getHoTen() + " - "
                       + thiSinh[i].getDiaChi() + " - " + thiSinh[i].getMucUuTien() + " - " + thiSinh[i].getKhoi());
               checker = true;
               break;
           }
        }

        if(checker == false)
            System.out.println("Khong co thi sinh voi ma so " + maSo);
    }

    public ThiSinh[] getThiSinh() {
        return thiSinh;
    }

    public void setThiSinh(ThiSinh[] thiSinh) {
        this.thiSinh = thiSinh;
    }

    public int getSoThiSinh() {
        return soThiSinh;
    }

    public void setSoThiSinh(int soThiSinh) {
        this.soThiSinh = soThiSinh;
    }
}
