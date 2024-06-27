package com.cbfacademy.sort;

import java.util.Arrays;

import com.cbfacademy.sort.QuickSort;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        QuickSort sorter = new QuickSort();
        int[] myarr = new int[]{55, 18, -9, 3, 107, 24, 66, 0};
        sorter.sort(myarr,0,7);
        System.out.println(Arrays.toString(myarr));
    }
}

// ./mvnw -q --projects sort clean compile exec:java -Dexec.mainClass=com.cbfacademy.sort.App
