package com.msb.lesson11.TanNT9.cv;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ArrayList<CV> AllCV = new ArrayList();
		ArrayList<GoodStudent> ArrGoodStudent = new ArrayList();
		ArrayList<NormalStudent> ArrNormalStudent = new ArrayList();
		int totalStudent;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Students: ");
		totalStudent = sc.nextInt();

		for (int i = 0; i < totalStudent; i++) {

			System.out.println("Enter Infor of Student " + (i + 1));

			System.out.print("Enter 1 - Good Student or 2 - Normal Student: ");
			int inputString = sc.nextInt();
			switch (inputString) {
			case 1:
				GoodStudent goodStudent = new GoodStudent();
				inputGoodStudent();
				ArrGoodStudent.add(goodStudent);
				AllCV.addAll(ArrGoodStudent);
				break;
			case 2:
				NormalStudent normalStudent = new NormalStudent();
				inputNormalStudent();
				ArrNormalStudent.add(normalStudent);
				AllCV.addAll(ArrNormalStudent);
				break;
			}
			
		}

		for (int i = 0; i < AllCV.size(); i++) {
			System.out.println("Student " + (i +1));
			AllCV.get(i).ShowMyInfor();
		}
	}

	public static void inputGoodStudent() throws Exception {
		GoodStudent Good = new GoodStudent();
		Good.inputInfor();
		Good.BonusInfor();
	}

	public static void inputNormalStudent() throws Exception {
		NormalStudent Normal = new NormalStudent();
		Normal.inputInfor();
		Normal.BonusInfor();
	}

}
