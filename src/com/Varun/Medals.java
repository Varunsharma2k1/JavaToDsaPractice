package com.Varun;

import java.util.Arrays;

public class Medals {
    public static void main(String[] args) {
       int a=5,b=11,c=22;
       int s=0;
       if(a>b && b>c)
           s+=(a+b);
        if(b>a && a>c)
            s+=(a+b);
        if(c>a && a>b)
            s+=(a+c);
        if(c>b && b>a)
            s+=(c+b);
        System.out.println(s);

    }
}
