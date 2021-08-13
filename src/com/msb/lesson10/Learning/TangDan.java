package com.msb.lesson10.Learning;

/**
 * @author chamhtp2
 */

public class TangDan {

	public static String run() {
		int[] m = { 4, 6, 2, 1, 9, 7, 3, 10, 8, 5, 11 };
		String result = "";
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i] > m[j]) {
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
			}
			result = result + (m[i] + ", ");
		}

		return result;
	}

}
