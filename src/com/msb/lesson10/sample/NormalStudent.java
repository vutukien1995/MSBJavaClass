package com.msb.lesson10.sample;

import com.msb.lesson10.sample.exception.InvalidDOBException;
import com.msb.lesson10.sample.exception.InvalidFullNameException;
import com.msb.lesson10.sample.exception.InvalidPhoneNumberException;

public class NormalStudent extends Student{

    private String englishScore;
    private String entryTestScore;

    public NormalStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
                       String gradeLevel, String englishScore, String entryTestScore) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public String getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(String englishScore) {
        this.englishScore = englishScore;
    }

    public String getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(String entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

}
