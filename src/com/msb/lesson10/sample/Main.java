package com.msb.lesson10.sample;

import com.msb.lesson10.sample.exception.InvalidDOBException;
import com.msb.lesson10.sample.exception.InvalidFullNameException;
import com.msb.lesson10.sample.exception.InvalidPhoneNumberException;

import java.util.List;

public class Main {
    static Lophoc lophoc = new Lophoc();

    public static void main(String[] args) {

        try {
            // Good student
            GoodStudent goodStudent1 = new GoodStudent("Nguyen good A", "03/10/1999", "Nam", "0901234445",
                    "UET", "GREAT", "3.1", "ABC");
            GoodStudent goodStudent2 = new GoodStudent("Nguyen good B", "03/10/1999", "Nam", "0351234445",
                    "UET", "GREAT", "3.6", "ABC");
            GoodStudent goodStudent3 = new GoodStudent("Nguyen good C", "03/10/1999", "Nam", "0351234445",
                    "UET", "GREAT", "2.5", "ABC");
            GoodStudent goodStudent4 = new GoodStudent("Nguyen good D", "03/10/1999", "Nam", "0351234445",
                    "UET", "GREAT", "1.5", "ABC");
            lophoc.getGoodStudentList().add(goodStudent1);
            lophoc.getGoodStudentList().add(goodStudent2);
            lophoc.getGoodStudentList().add(goodStudent3);
            lophoc.getGoodStudentList().add(goodStudent4);

            // Normal student
            NormalStudent normalStudent1 = new NormalStudent("Nguyen normal A", "01/10/1999", "Nam", "0906776688",
                    "UET", "GREAT", "500", "300");
            lophoc.getNormalStudentList().add(normalStudent1);

        } catch (InvalidDOBException | InvalidPhoneNumberException | InvalidFullNameException e) {
            System.out.println("Có lỗi xảy ra: ");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Input files have unknow errors !!!");
        }


        // Console
        lophoc.show();

        // Get candidate
        System.out.println("List of Candidate: ");
        List<Student> list = lophoc.getCandidate(5);
        for(Student student : list) {
            student.showMyInfo();
        }
    }
}
