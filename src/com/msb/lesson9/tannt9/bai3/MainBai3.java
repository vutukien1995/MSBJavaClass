/*
 * Bài 3: Viết chương trình nhập vào một mảng số nguyên có n phần tử (dùng mảng Array)
a) Xuất giá trị các phần tử của mảng.
b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
c) Sắp xếp mảng tăng dần
 */
package com.msb.lesson9.tannt9.bai3;

import java.util.Scanner;

public class MainBai3 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng số nguyên: ");
		n = sc.nextInt();
		int soNguyen[] = new int[n];

		for (int i = 0; i < n; i++) {
			// Nhập các phần tử của mảng số nguyên
			System.out.println("- Nhập phần tử thứ " + (i + 1) + ": ");
			soNguyen[i] = sc.nextInt();
		}

		// a. Xuất giá trị các phần tử của mảng
		System.out.print("\na. Các phần tử của mảng là:  ");
		for (int i = 0; i < n; i++) {
			System.out.print(soNguyen[i] + "\t");
		}

		// b. Tìm phần tử có giá trị lớn nhất, nhỏ nhất
		int soLonNhat = soNguyen[0];
		int soNhoNhat = soNguyen[0];

		for (int i = 1; i < n; i++) {
			// Giá trị lớn nhất
			if (soNguyen[i] > soLonNhat) {
				soLonNhat = soNguyen[i];
			}
			// Giá trị nhỏ nhất
			if (soNguyen[i] < soNhoNhat) {
				soNhoNhat = soNguyen[i];
			}
		}
		System.out.println("\nb.");
		System.out.println("- Phần tử có giá trị lớn nhất:  " + soLonNhat);
		System.out.println("- Phần tử có giá trị nhỏ nhất:  " + soNhoNhat);

		// c. Sắp xếp mảng tăng dần
		int temp;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++) {
				if (soNguyen[i] > soNguyen[j]) {
					temp = soNguyen[i];
					soNguyen[i] = soNguyen[j];
					soNguyen[j] = temp;
				}

			}
		System.out.print("\nc. Mảng sắp xếp theo thứ tự tăng dần:  ");
		for (int i = 0; i < n; i++) {
			System.out.print(soNguyen[i] + "\t");
		}

	}

}
