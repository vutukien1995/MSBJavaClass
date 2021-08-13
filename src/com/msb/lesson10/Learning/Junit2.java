package com.msb.lesson10.Learning;

import org.junit.*;

public class Junit2 {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case
    @Test
    public void test() {
        System.out.println("in test");
    }

    //test case ignore and will not execute
    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }

}
