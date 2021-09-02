package com.msb.final_exam.AnhNTL19.bai3;

import java.math.BigDecimal;

public class checkFee {
    public checkFee() {
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
