package com.msb.lesson10.sample.sort;

import com.msb.lesson10.sample.Student;

import java.util.Comparator;

public class SortStudent implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getFullName().toLowerCase().compareTo(s2.getFullName().toLowerCase()) == 0)
            return s1.getPhoneNumber().toLowerCase().compareTo(s2.getPhoneNumber().toLowerCase());
        return s1.getFullName().toLowerCase().compareTo(s2.getFullName().toLowerCase());
    }
}
