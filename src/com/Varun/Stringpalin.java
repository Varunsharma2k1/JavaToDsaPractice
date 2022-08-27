package com.Varun;

import java.util.Locale;
import java.util.Stack;

public class Stringpalin {
    public static void main(String[] args) {
        String  s = "A man, a plan, a canal: Panama";



        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        s = s.toLowerCase();
        StringBuilder st = new StringBuilder(s);
        st = st.reverse();

        String ans = st.toString();

        if(ans.equals(s))
            System.out.println(true);
        else
            System.out.println(false);

    }
}
