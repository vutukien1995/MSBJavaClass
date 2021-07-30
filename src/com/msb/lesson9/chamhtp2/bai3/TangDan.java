package com.msb.lesson9.chamhtp2.bai3;

/**
 * @author chamhtp2
 */

public class TangDan {

	public static void main(String[] args) {
		int[] m = { 4, 6, 2, 1, 9, 7, 3, 10, 8, 5 };
		for (int i = 0; i < m.length - 1; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
			for (int k = 0; k < m.length; k++) {
				System.out.print(m[k] + ", ");
			}
			System.out.println();
		}
	}

}
