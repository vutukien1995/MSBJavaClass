package com.msb.learn;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Nhanvien[] list_nhanvien = new Nhanvien[100];

        Nhanvien nhanvien1 = new Nhanvien();
        nhanvien1.ten = "Giang";
        nhanvien1.tuoi = 22;
        nhanvien1.que_quan = "Hai Duong";
        list_nhanvien[0] = nhanvien1;

        for (int i = 0; i<1; i++) {
            System.out.println(list_nhanvien[i].ten + " - " + list_nhanvien[i].tuoi + " - " + list_nhanvien[i].que_quan);
        }
    }
}
