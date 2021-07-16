package com.msb.lesson6;

public class Main {

    public static void main(String[] args) {

        Khoi khoiA = new Khoi("A", "Toán, Lý, Hoá");
        Khoi khoiB = new Khoi("B", "Toán, Hoá, Sinh");
        Khoi khoiC = new Khoi("C", "Văn, Sử, Địa");

        ThiSinh thiSinh1 = new ThiSinh("001", "Tran Van A", "Ca Mau", "1", khoiA);
        ThiSinh thiSinh2 = new ThiSinh("002", "Tran Van Linh Chi", "Hai Duong", "2", khoiB);
        ThiSinh thiSinh3 = new ThiSinh("003", "Nguyen Tran My", "Bac Ninh", "3", khoiC);

        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.themThiSinh(thiSinh1);
        tuyenSinh.themThiSinh(thiSinh2);
        tuyenSinh.themThiSinh(thiSinh3);

        tuyenSinh.hienThiSinh();
        tuyenSinh.timThiSinh("00s1");
    }

}
