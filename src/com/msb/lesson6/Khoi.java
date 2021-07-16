package com.msb.lesson6;

public class Khoi {

    private String ten;
    private String cacMon;

    public Khoi (String ten, String cacMon) {
        this.ten = ten;
        this.cacMon = cacMon;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getCacMon() {
        return cacMon;
    }

    public void setCacMon(String cacMon) {
        this.cacMon = cacMon;
    }

    @Override
    public String toString() {
        return "Khoi: " + ten + " (" + cacMon +")";
    }
}
