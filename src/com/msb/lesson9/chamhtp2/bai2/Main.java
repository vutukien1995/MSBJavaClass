package com.msb.lesson9.chamhtp2.bai2;

/**
 * @author chamhtp2
 * title: In ra xâu đảo ngược với xâu đã nhập
 */

public class Main {
	public static void main(String[] args) {
		String input = "Hello Châm!";
		StringBuffer stringBuffer = new StringBuffer(input);
		System.out.println(stringBuffer.reverse().toString());
	}
}