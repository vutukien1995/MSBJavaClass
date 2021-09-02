package com.msb.lesson11.someone;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkFee(null));
    }

    public static boolean checkFee(BigDecimal amount) {
        if(amount == null) return false;
        BigDecimal minFee = new BigDecimal("50000");
        return amount.compareTo(minFee) >= 0;
    }


}
