package com.msb.lesson9.thuocnt.bai2;
/*
Bài 2: Viết chương trình nhập vào 1 xâu ký tự bất kỳ.
In ra xâu đảo ngược với xâu đã nhập.
 * */
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Mời bạn nhập xâu kí tự: ");
		Scanner sc = new Scanner(System.in);
		String xaukitu = sc.nextLine();
		StringBuilder str = new StringBuilder(xaukitu);
        System.out.println("Xâu đảo ngược: "+str.reverse().toString());
		
	}

}
