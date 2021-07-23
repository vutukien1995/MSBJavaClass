package com.msb.lesson7.Sample.bai3;

/**
 * @author kienvt2
 */
public class Rabbit extends Pet {

    public Rabbit(String ten, int tuoi, int canNang, String mauSac) {
        super(ten, tuoi, canNang, mauSac);
    }

    @Override
    public String tiengKeu() {
        return "Thỏ thỏ !!!";
    }

}
