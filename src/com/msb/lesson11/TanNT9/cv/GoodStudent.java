package com.msb.lesson11.TanNT9.cv;
import java.util.Scanner;

public class GoodStudent extends CV {

	public GoodStudent() {
		super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
		// TODO Auto-generated constructor stub
	}
	
	private CV CV;
	protected float gpa;
	protected String bestRewardName;

	public void BonusInfor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("GPA: ");
		this.gpa = sc.nextFloat();
		System.out.println("Best Reward: ");
		this.bestRewardName = sc.nextLine();
		sc.nextLine();
	}

//	public void ShowMyInfor() {
//	System.out.println(this.fullName + " - " + this.doB + " - " + this.sex + " - " + this.phoneNumber + " - "
//			+ this.universityName + " - " + this.gradeLevel + " GPA: " + this.gpa + " - Best Reward: " + this.bestRewardName);
//}	

	//	public void inputGoodStudent() {
//		Scanner sc = new Scanner(System.in);
//		CV.inputInfor();
//		System.out.println("GPA: ");
//		this.gpa = sc.nextFloat();
//		System.out.println("Best Reward: ");
//		this.bestRewardName = sc.nextLine();
//	}
	
//	public void showGoodStudent() {
//		CV.ShowMyInfor();
//		System.out.println(" GPA: " + this.gpa + " - Best Reward: " + this.bestRewardName);
//	}

}
