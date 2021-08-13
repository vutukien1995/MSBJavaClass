package com.msb.lesson10.exercise;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void run() {
        System.out.println("== Start Test ==");
        TransactionServiceAPI api = new TransactionServiceAPI();

        TransactionInput input = new TransactionInput("013993939399", "0100110199922",
                "1000000", "Chuyen tien !!!");
        TransactionOutput dummyData = new TransactionOutput("Success !!", "");
        api.dummyDataOutput(dummyData);

        Assert.assertEquals(api.trans(input).getErrCode(), "");
        System.out.println("== End Test ==");
    }

    @Test
    public void runWithDelayTime() {
        System.out.println("== Start Test with delay time ==");
        TransactionServiceAPI api = new TransactionServiceAPI();

        TransactionInput input = new TransactionInput("013993939399", "0100110199922",
                "1000000", "Chuyen tien !!!");
        TransactionOutput dummyData = new TransactionOutput("Success !!", "");
        api.dummyDataOutput(dummyData);
        api.dummyDelayTime(2000);

        Assert.assertEquals(api.trans(input).getErrCode(), "");
        System.out.println("== End Test ==");
    }

}
