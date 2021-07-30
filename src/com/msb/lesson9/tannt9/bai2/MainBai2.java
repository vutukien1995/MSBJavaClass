/*
 * Bài 2: Viết chương trình nhập vào 1 xâu ký tự bất kỳ.
In ra xâu đảo ngược với xâu đã nhập.
 */
package com.msb.lesson9.tannt9.bai2;

import java.util.Scanner;

public class MainBai2 {


	public static void main(String[] args) {

		String chuoiKyTu;
		int n;
		Scanner sc = new Scanner(System.in);
		//Nhập vào chuối ký tư
		System.out.println("Nhập vào 1 chuỗi ký tự: ");
		chuoiKyTu = sc.nextLine();
		n = chuoiKyTu.length();
		//In ra chuỗi đảo ngược
		System.out.println("=> Chuỗi đảo ngược: ");
		for (int i = 0; i < n; i++) {
			System.out.print(chuoiKyTu.charAt(n - i - 1));
		}
	}


}
