package com.Varun;

public class Lowercase {
    public static void main(String[] args) {
        String a = "HelloWorld";
//        System.out.println((char)(a.charAt(0)+32));
//        a.replace(a.charAt(0),(char)(a.charAt(0)+ 26));
//        System.out.println(a);
        String ans = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'){
                ans = ans + (char)(a.charAt(i)+32);
            }
            else
                ans = ans + a.charAt(i);
        }
        System.out.println(ans);
    }
}
