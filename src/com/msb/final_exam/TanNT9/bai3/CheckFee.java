package com.msb.final_exam.TanNT9.bai3;

import java.math.BigDecimal;

public class CheckFee {
    public CheckFee() {
    }

    public static boolean checkFee(BigDecimal amount) {
        if (amount == null) {
            return false;
        } else {
            BigDecimal minFee = new BigDecimal("50000");
            return amount.compareTo(minFee) >= 0;
        }
    }
}