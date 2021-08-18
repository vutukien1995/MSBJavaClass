package com.msb.lesson10.sample;

import com.msb.lesson10.sample.exception.InvalidDOBException;
import com.msb.lesson10.sample.exception.InvalidFullNameException;
import com.msb.lesson10.sample.exception.InvalidPhoneNumberException;

public class GoodStudent extends Student {

    private String gpaScore;
    private String bestRewardName;

    public GoodStudent(String fullName, String doB, String sex, String phoneNumber, String universityName,
                       String gradeLevel, String gpaScore, String bestRewardName) throws InvalidFullNameException, InvalidDOBException, InvalidPhoneNumberException {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpaScore = gpaScore;
        this.bestRewardName = bestRewardName;
    }

    public String getGpaScore() {
        return gpaScore;
    }

    public void setGpaScore(String gpaScore) {
        this.gpaScore = gpaScore;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

}
