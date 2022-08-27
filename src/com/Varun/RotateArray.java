package com.Varun;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,1,4,5,6};
//        System.out.println(4*5 + "codig"+ 4 +"fun" +5+5);
       int min = Arrays.stream(a).min().getAsInt();
        System.out.println(min);

//        int d= 0 ;
//        char ch = 'b';
//        while(ch<='z' && ch >='a') {
//            ch++;
//            d++;
//        }
//        System.out.println(d);
    }
}
