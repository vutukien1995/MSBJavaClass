package com.msb.lesson11.TanNT9.cv;
import java.util.Scanner;

public class NormalStudent extends CV {

	public NormalStudent() {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		// TODO Auto-generated constructor stub
	}




	private CV CV;
	protected int englishScore;
	protected String entryTestScore;
	
	
	public void BonusInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("English Score: ");
		this.englishScore = sc.nextInt();
		System.out.println("Entry TestScore: ");
		this.entryTestScore = sc.nextLine();
		sc.nextLine();
	}

//public void ShowMyInfor() {
//	System.out.println(this.fullName + " - " + this.doB + " - " + this.sex + " - " + this.phoneNumber + " - "
//			+ this.universityName + " - " + this.gradeLevel + " English Score: " + this.englishScore + " - Entry TestScore: " + this.entryTestScore);
//}	
//	
	
//	
//	public void inputNormalStudent() {
//		Scanner sc = new Scanner(System.in);
//		CV.inputInfor();
//		System.out.println("English Score: ");
//		this.englishScore = sc.nextInt();
//		System.out.println("Entry TestScore: ");
//		this.entryTestScore = sc.nextLine();
//	}
	
//	public void showGoodStudent() {
//		CV.ShowMyInfor();
//		System.out.println(" English Score: " + this.englishScore + " - Entry TestScore: " + this.entryTestScore);
//	}
}
