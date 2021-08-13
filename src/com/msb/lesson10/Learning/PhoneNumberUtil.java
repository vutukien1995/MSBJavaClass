package com.msb.lesson10.Learning;

import com.sun.xml.internal.ws.util.StringUtils;

public class PhoneNumberUtil {

    public static int validate(String sdt) {

        if(sdt.length() > 12) {
            System.out.println("Số dài hơn cho phép !");
            return 1;
        }

        if(!(sdt.startsWith("0") || sdt.startsWith("+84"))) {
            System.out.println("Sđt không đúng định dạng !");
            return 2;
        }

        sdt = sdt.substring(1);
        if(!sdt.matches("-?\\d+")) {
            System.out.println("Sđt phải là số !");
            return 3;
        }

        return 0;
    }

    public static int validate2(String sdt) {

        try {
            Thread.sleep(1000l); // cho máy nghỉ 1,5s
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
