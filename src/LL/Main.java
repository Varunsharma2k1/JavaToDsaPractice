package LL;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String a = "Myself2 Me1 I4 and3";
        String[] ans = a.split(" ");
        String[] res = new String[ans.length];
        for(String s:ans){
           int ch= s.charAt(s.length()-1)-'1';
           res[ch] = s.substring(0,s.length()- 1);
        }
    String t = String.join("-",res);
        System.out.println(t);
    }
}
