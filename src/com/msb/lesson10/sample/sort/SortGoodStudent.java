package com.msb.lesson10.sample.sort;

import com.msb.lesson10.sample.GoodStudent;

import java.util.Comparator;

public class SortGoodStudent implements Comparator<GoodStudent> {

    @Override
    public int compare(GoodStudent gs1, GoodStudent gs2) {
        return gs1.getGpaScore().compareTo(gs2.getGpaScore())*-1;
    }

}
