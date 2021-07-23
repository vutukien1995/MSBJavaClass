package com.msb.lesson7.Sample.bai3;

/**
 * @author kienvt2
 */
public abstract class Pet {

    private String ten;
    private int tuoi;
    private int canNang;
    private String mauSac;

    abstract public String tiengKeu();

    public Pet(String ten, int tuoi, int canNang, String mauSac) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return ten + " - " + tuoi + " - " + canNang + " - " + mauSac + " - " + tiengKeu();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
}
