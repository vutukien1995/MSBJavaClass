package com.msb.final_exam.ThuocNT.bai3;

import java.math.BigDecimal;

public class CheckFee {
	 public static boolean checkFee(BigDecimal amount) {
	    	if(amount == null) return false;
	    	BigDecimal minFee = new BigDecimal("50000");
	    	return amount.compareTo(minFee) >= 0;
	    }
}
