package com.msb.lesson10.Learning;

import org.junit.Assert;
import org.junit.Test;

public class Junit {

    @Test
    public void runTest() {
        Assert.assertEquals(0, PhoneNumberUtil.validate("03213213233"));
    }

    @Test
    public void runTest1() {
        Assert.assertEquals(1, PhoneNumberUtil.validate("034806638832132"));
    }

    @Test
    public void runTest2() {
        Assert.assertEquals(2, PhoneNumberUtil.validate("11348066388"));
    }

    @Test
    public void runTest3() {
        Assert.assertEquals(3, PhoneNumberUtil.validate("03321321fds"));
    }

    @Test
    public void runTest4() {
        String[] array1 = {"1", "2", "4", "5"};
        String[] array2 = {"1", "2", "4", "5"};
        Assert.assertNotEquals("10", "1");
        Assert.assertArrayEquals(array1, array2);
    }

    @Test(timeout = 1000)
    public void runTest5() {
        Assert.assertEquals(0, PhoneNumberUtil.validate2("abc123"));
    }

}
