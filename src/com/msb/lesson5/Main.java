package com.msb.lesson5;

public class Main {

    public static void main(String[] args) {

        Product[] products = new Product[3];

        Product product = new Product("PRD01", "Xe đạp", 2, 199900000);
        Product product2 = new Product("PRD02", "Xe máy", 10, 900000000);
        Product product3 = new Product("PRD03", "Xe moto", 12, 190000);

        products[0] = product;
        products[1] = product2;
        products[2] = product3;

        Product spGiaCaoNhat = products[0];

        for (int i = 1; i<3; i++) {
            if (products[i].getGia1SP() > spGiaCaoNhat.getGia1SP()) {
                spGiaCaoNhat = products[i];
            }
        }

        spGiaCaoNhat.display();
    }

}
