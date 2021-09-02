package com.msb.lesson11.TanNT9.junit;
import java.util.Date;

public class TransactionOutput {
	private String message;
    private String errCode;
    private Date timestamp = new Date();

    public TransactionOutput(String message, String errCode) {
        this.message = message;
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
