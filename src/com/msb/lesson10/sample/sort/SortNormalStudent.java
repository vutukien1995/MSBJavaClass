package com.msb.lesson10.sample.sort;

import com.msb.lesson10.sample.NormalStudent;

import java.util.Comparator;

public class SortNormalStudent implements Comparator<NormalStudent> {

    @Override
    public int compare(NormalStudent ns1, NormalStudent ns2) {
        return ns1.getEnglishScore().toLowerCase().compareTo(ns2.getEnglishScore().toLowerCase());
    }

}
