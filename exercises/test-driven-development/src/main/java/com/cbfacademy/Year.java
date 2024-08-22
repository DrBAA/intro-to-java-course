package com.cbfacademy;

public class Year {
    public static boolean isLeap(int year) {
        // years divisible by 400 are leap years
        if (year % 400 == 0) {
            return true;
        } else {
            
        }
        return false;// year % 400 == 0;
    }
}
