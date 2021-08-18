package com.msb.lesson10.sample;

import com.msb.lesson10.sample.sort.SortGoodStudent;
import com.msb.lesson10.sample.sort.SortNormalStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lophoc {

    private List<GoodStudent> goodStudentList = new ArrayList<>();
    private List<NormalStudent> normalStudentList = new ArrayList<>();

    public void show() {
        List<Student> studentList = new ArrayList<Student>();
        Collections.sort(goodStudentList, new SortGoodStudent());
        Collections.sort(normalStudentList, new SortNormalStudent());
        studentList.addAll(goodStudentList);
        studentList.addAll(normalStudentList);

        for (Student student : studentList) {
            student.showMyInfo();
        }
    }

    public List<Student> getCandidate(int numberOfCandidate) {
        Collections.sort(goodStudentList, new SortGoodStudent());
        Collections.sort(normalStudentList, new SortNormalStudent());
        List<Student> studentList = new ArrayList<Student>();

        studentList.addAll(goodStudentList);
        if (numberOfCandidate <= goodStudentList.size())
            return studentList.subList(0, numberOfCandidate);

        studentList.addAll(normalStudentList);
        if (numberOfCandidate <= studentList.size())
            return studentList.subList(0, studentList.size());

        return studentList;
    }

    public List<GoodStudent> getGoodStudentList() {
        return goodStudentList;
    }

    public void setGoodStudentList(List<GoodStudent> goodStudentList) {
        this.goodStudentList = goodStudentList;
    }

    public List<NormalStudent> getNormalStudentList() {
        return normalStudentList;
    }

    public void setNormalStudentList(List<NormalStudent> normalStudentList) {
        this.normalStudentList = normalStudentList;
    }

}
