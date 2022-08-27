package com.Varun;

import java.util.Arrays;

public class StringEqui {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        String s1="";
        String s2="";
       for(String s: word1)
           s1 += s;
        for(String s: word1)
            s2 += s;
        if(s1==s2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
