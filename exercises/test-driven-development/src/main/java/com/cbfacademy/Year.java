package com.cbfacademy;

public class Year {

    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } 
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } 
        else {
            return false;
        }
    }
}

// source: https://iq.opengenus.org/check-if-given-year-is-leap-year/
