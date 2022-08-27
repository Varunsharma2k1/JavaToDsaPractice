package com.Varun;

public class MoveHashString {
    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        String ans="";
        String ans1 = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='#')
                ans+=s.charAt(i);
            else
                ans1+=s.charAt(i);
        }
        System.out.println(ans+ans1);
    }
}
