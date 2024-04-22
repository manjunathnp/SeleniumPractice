package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateTime {
    public static void main(String[] args) {
        /*String currentDateTime = new SimpleDateFormat("dd-MMM-yyyy_HH:mm_a").format(new Date());

        System.out.println(currentDateTime);*/
        printCurrentDateTime();
    }

    private static void printCurrentDateTime(){
        String currentDateTimeStamp =
                new SimpleDateFormat("dd|MMM|YYYY-HH:mm:ss-a").format(new Date());
        System.out.println("Current Date Time Stamp: "+currentDateTimeStamp);
    }
}
