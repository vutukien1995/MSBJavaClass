package com.msb.lesson9.thuocnt.bai3;
/*Bài 3: Viết chương trình nhập vào một mảng số nguyên có n phần tử (dùng mảng Array)
a) Xuất giá trị các phần tử của mảng.
b) Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
c) Sắp xếp mảng tăng dần
*/
import java.util.Scanner;

public class Main {
	static int[] mangso;
	static int soPhanTu;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mời bạn nhập số phần tử của mảng: ");		
		soPhanTu = sc.nextInt();
		if (soPhanTu > 0) {
			mangso = new int[soPhanTu];
			nhap();
			show();
			minMax();
			sapXep();
			System.out.print("Theo thứ tự từ nhỏ đến lớn: ");		
			show();
			
		}else {
			System.out.print("Số phần thử của mảng không hơp lệ");
		}
				
		
		
	}
	public static void nhap() {
		//nhập mảng
		for(int i = 0; i< soPhanTu; i++) {
			System.out.print("Số thứ "+ (i+1)+ ": ");
			mangso[i] = sc.nextInt();
		}
	}
	public static void show() {
		System.out.print("Mảng: ");
		for(int i = 0; i< soPhanTu; i++) {
			System.out.print(mangso[i]+ ", ");				
		}
	}
	public static void minMax() {
		int min = mangso[0];
		int max = mangso[0];
		for(int i = 1; i< soPhanTu; i++) {
			if(mangso[i]<min) {
				min = mangso[i];
			}
			if(mangso[i]>max) {
				max = mangso[i];
			}
		
		}		
		System.out.println("\n"+"Số nhỏ nhất: "+ min);
		System.out.println("Số lớn nhất: "+ max);
	}
	public static void sapXep() {
		int temp = mangso[0];
        for (int i = 0 ; i <soPhanTu - 1; i++) {
            for (int j = i + 1; j <soPhanTu; j++) {
                if (mangso[i] > mangso[j]) {
                    temp = mangso[j];
                    mangso[j] = mangso[i];
                    mangso[i] = temp;
                }
            }
        }
		
	}

}
