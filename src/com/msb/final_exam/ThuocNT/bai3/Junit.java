package com.msb.final_exam.ThuocNT.bai3;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class Junit {

    @Test
    public void runTest1() {
    	BigDecimal bdValue = new BigDecimal("50000.000001");    	
    	Assert.assertEquals(true, CheckFee.checkFee(bdValue));
    }
    
    @Test
    public void runTest2() {
    	BigDecimal bdValue = new BigDecimal("50000");    	
    	Assert.assertEquals(true, CheckFee.checkFee(bdValue));
    }
    
    @Test
    public void runTest3() {
    	BigDecimal bdValue = new BigDecimal("49999.999999");    	
    	Assert.assertEquals(false, CheckFee.checkFee(bdValue));
    }
    
    //0
    @Test
    public void runTest4() {
    	BigDecimal bdValue = new BigDecimal("0");
        Assert.assertEquals(false, CheckFee.checkFee(bdValue));
    }
    
    @Test
    public void runTest5() {
    	BigDecimal bdValue = new BigDecimal("-0.00001");
        Assert.assertEquals(false, CheckFee.checkFee(bdValue));
    }
    
    @Test
    public void runTest6() {
    	BigDecimal bdValue = new BigDecimal("-500000");
        Assert.assertEquals(false, CheckFee.checkFee(bdValue));
    }
}