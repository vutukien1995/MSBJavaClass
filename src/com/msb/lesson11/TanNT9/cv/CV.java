package com.msb.lesson11.TanNT9.cv;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class CV {
	protected static String fullName;
	protected static String doB;
	protected static String sex;
	protected static String phoneNumber;
	protected static String universityName;
	protected static String gradeLevel;

	/*
	 * // HS khá giỏi abstract public float gpa(); abstract public String
	 * bestRewardName();
	 * 
	 * // HS trung bình abstract public int englishScore(); abstract public String
	 * entryTestScore();
	 */
	abstract void BonusInfor();

	public CV(String fullName, String doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
		super();
		this.fullName = fullName;
		this.doB = doB;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDoB() {
		return doB;
	}

	public void setDoB(String doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public void inputInfor() throws Exception {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("FullName: ");
		this.fullName = sc.nextLine();
		//InvalidFullNameException();
		
		System.out.println("Date of birth: ");
		this.doB = sc.nextLine();
		//InvalidDOBException();
		
		System.out.println("Gender: ");
		this.sex = sc.nextLine();
		
		System.out.println("Phone Number: ");			
		this.phoneNumber = sc.nextLine();
		//InvalidPhoneNumberException();
		
		System.out.println("University Name: ");
		this.universityName = sc.nextLine();
		
		System.out.println("Grade Level: ");
		this.gradeLevel = sc.nextLine();
		
		} catch (Exception e) {
		System.out.println("Input files have unknow errors !!! ");
		}
	}
	
	 public static void InvalidFullNameException() throws Exception {
		 if(fullName.length() > 50 || fullName.length() < 10) {
			 throw new Exception ("Please enter into field Fullname from 10 to 50 characters!");}
	}
	 //InvalidDOBException (chưa làm được)
	
	 
	 
	 public static void InvalidPhoneNumberException() throws Exception {
		 if(phoneNumber.length() != 10 || !(phoneNumber.substring(0, 3) != "090" || phoneNumber.substring(0, 3) != "098" 
				 							|| phoneNumber.substring(0, 3) != "091" || phoneNumber.substring(0, 3) != "031" 
				 							|| phoneNumber.substring(0, 3) != "035" || phoneNumber.substring(0, 3) != "038") ) 
		 {
			 throw new Exception ("Invalid Phone Number. Please enter phone number has 10 digits and starts of 090 or 098 or 091 or 031 or 035 or 038!");
		}
	}

	 public void ShowMyInfor() {
			System.out.println(this.fullName + " - " + this.doB + " - " + this.sex + " - " + this.phoneNumber + " - "
					+ this.universityName + " - " + this.gradeLevel );
		}	
			
}
