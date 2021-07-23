package com.msb.lesson7.Sample.bai3;

/**
 * @author kienvt2
 */
public class Dog extends Pet {

    public Dog(String ten, int tuoi, int canNang, String mauSac) {
        super(ten, tuoi, canNang, mauSac);
    }

    @Override
    public String tiengKeu() {
        return "Gâu gâu !!!";
    }

}
