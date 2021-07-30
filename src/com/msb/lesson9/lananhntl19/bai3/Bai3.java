package com.msb.lesson9.lananhntl19.bai3;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while(n < 0);

        int[] array = new int[n];

        int min;
        for(min = 0; min < n; ++min) {
            System.out.print("\nNhập phần tử thứ " + min + ": ");
            array[min] = sc.nextInt();
        }

        System.out.print("Mảng là: ");

        for(min = 0; min < n; ++min) {
            System.out.print(array[min] + "\t");
        }

        min = array[0];
        int max = array[0];

        int i;
        for(i = 0; i < array.length; ++i) {
            if (array[i] < min) {
                min = array[i];
            }

            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\nGiá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);

        for(i = 0; i < n - 1; ++i) {
            for(int j = i + 1; j <= n - 1; ++j) {
                if (array[i] > array[j]) {
                    int tempSort = array[i];
                    array[i] = array[j];
                    array[j] = tempSort;
                }
            }
        }

        System.out.print("Mảng sau khi sắp xếp là: ");

        for(i = 0; i < n; ++i) {
            System.out.print(array[i] + "\t");
        }

    }

}
