package com.msb.final_exam.TanNT9.bai3;

import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;

public class JUnit {
    public JUnit() {
    }

    @Test
    public void runTestcase1() {
        BigDecimal bd1 = new BigDecimal("50000");
        System.out.println("TC 1: Số tiền truyền vào = 50000");
        Assert.assertEquals(true, CheckFee.checkFee(bd1));
    }

    @Test
    public void runTestcase2() {
        BigDecimal bd1 = new BigDecimal("50001");
        System.out.println("TC 2: Số tiền truyền vào > 50000");
        Assert.assertEquals(true, CheckFee.checkFee(bd1));
    }

    @Test
    public void runTestcase3() {
        BigDecimal bd1 = new BigDecimal("49999");
        System.out.println("TC 3: Số tiền truyền vào < 50000");
        Assert.assertEquals(false, CheckFee.checkFee(bd1));
    }

    @Test
    public void runTestcase4() {
        System.out.println("TC 4: Số tiền truyền vào là null");
        Assert.assertEquals(false, CheckFee.checkFee((BigDecimal)null));
    }
}