package com.msb.lesson10.exercise;

import com.google.gson.Gson;
import org.ietf.jgss.GSSContext;

public class TransactionServiceAPI {

    private TransactionOutput output;
    private long delayTime;

    /**
     * Giả lập lời api với lời call đến core banking.
     */
    public TransactionOutput trans(TransactionInput input) {

        System.out.println("Request: ");
        System.out.println(new Gson().toJson(input));

        // Dummy time delay call api
        if(delayTime != 0){
            try {
                System.out.println("Calling api...");
                Thread.sleep(delayTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(output == null)
            System.out.println("Output is missing !!!");
        else {
            System.out.println("Response: ");
            System.out.println(new Gson().toJson(output));
        }

        return output;
    }

    public void dummyDataOutput(TransactionOutput output) {
        this.output = output;
    }

    public void dummyDelayTime(long delayTime) {
        this.delayTime = delayTime;
    }

}
