package com.msb.lesson10.sample;

import com.msb.lesson10.sample.exception.InvalidDOBException;
import com.msb.lesson10.sample.exception.InvalidFullNameException;
import com.msb.lesson10.sample.exception.InvalidPhoneNumberException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    private String fullName;
    private String doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public Student(String fullName, String doB, String sex,
                    String phoneNumber, String universityName, String gradeLevel) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {

        // Validate
        if(fullName == null)
            throw new InvalidFullNameException("Full name is invalid!");
        else if (fullName.length()<10 || fullName.length()>50)
            throw new InvalidFullNameException("Full name is invalid!");

        Pattern pattern = Pattern.compile("^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$");
        Matcher matcher = pattern.matcher(doB);
        if(!matcher.find())
            throw new InvalidDOBException("Dob is invalid!");

        if(phoneNumber.length() != 10)
            throw new InvalidPhoneNumberException("Phone number is invalid!");
        if(!(phoneNumber.startsWith("090")
                || phoneNumber.startsWith("098")
                || phoneNumber.startsWith("091")
                || phoneNumber.startsWith("031")
                || phoneNumber.startsWith("035")
                || phoneNumber.startsWith("038"))){
            throw new InvalidPhoneNumberException("Phone number is invalid!");
        }

        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public void showMyInfo() {
        System.out.println(fullName + " - " + doB + " - " + sex + " - " + phoneNumber  + " - " +
                universityName + " - " + gradeLevel);
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
}
