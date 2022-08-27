package com.Varun;

public class SplitTheString {
    public static void main(String[] args) {
        String s= "textBook";
        String a= s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        int count=0,count1=0;
        for(int i =0;i<a.length();i++){
            char c = a.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' )
                count++;
        }
        for(int i =0;i<b.length();i++){
            char c = b.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' )
                count1++;
        }
        if(count == count1)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
