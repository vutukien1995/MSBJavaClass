package com.msb.lesson7.Sample.bai3;

/**
 * @author kienvt2
 */
public class Mouse extends Pet {

    public Mouse(String ten, int tuoi, int canNang, String mauSac) {
        super(ten, tuoi, canNang, mauSac);
    }

    @Override
    public String tiengKeu() {
        return "Chíp chíp !!!";
    }

}
