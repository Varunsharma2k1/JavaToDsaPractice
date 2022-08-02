package com.Varun;

public class CyclicString {
    public static void main(String[] args) {
        String a= "hello";
        String b= "hgllq";
        System.out.println(a);
        for(int i=0 ; i<a.length();i++){
            if(a.charAt(i) != b.charAt(i)){
               a.replace(a.charAt(i), b.charAt(i));
            }
        }
        System.out.println(a);
    }
}
