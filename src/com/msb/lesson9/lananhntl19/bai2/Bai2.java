package com.msb.lesson9.lananhntl19.bai2;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuối ký tự: ");
        String chuoi = sc.nextLine();
        char[] chuoiDao = chuoi.toCharArray();

        for(int i = 0; i < chuoi.length(); ++i) {
            System.out.print(chuoiDao[chuoiDao.length - i - 1]);
        }

        System.out.println();
    }

}
