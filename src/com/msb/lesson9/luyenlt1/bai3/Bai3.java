package com.msb.lesson9.luyenlt1.bai3;
import java.util.Arrays;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
		// Nhap so phan tu cua mang tu ban phim
		int arrInt[];
		int n;
		Scanner input =new Scanner(System.in);
		System.out.println("Xin moi nhap so luong phan tu cua mang n=: ");
		
		// Nhap tung phan tu cua mang so nguyen
		n=input.nextInt();
		arrInt = new int[n];		
		for (int i = 0; i < n; i++) {
		System.out.println("nhap a[" +i+"] =");
		arrInt[i] = input.nextInt();
		}
		// In ra mang so nguyen
		for (int i = 0; i < n; i++) {
		System.out.print(" a[" +i+"] =" + arrInt[i]+";");
		}
		
		// Tim gia tri nho nhat - lon nhat cua mang so nguyen
		int min = arrInt[0];
		int max = arrInt[0];
		for (int i = 0; i < n; i++) {
		if (arrInt[i]<min) {
		min = arrInt[i];
		}
		if (arrInt[i]>max) {
		max = arrInt[i];
		}
		}
		System.out.println("Gia tri nho nhat: "+min);
		System.out.println("Gia tri lon nhat: "+max);
		
		//Sap xep mang theo thu tu tang dan

		for (int i = 0; i < n; i++) {
			System.out.print(" a[" +i+"] =" + arrInt[i]+";");
		}Arrays.sort(arrInt);

	}
}
		

