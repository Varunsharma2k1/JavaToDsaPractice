package com.Varun;

import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
//        String a = "Varun";
//        String b = new String("Varun");
//        System.out.println(a.equals(b));
//        System.out.println((char)( 'a' + 'b'));
//        System.out.println("a"+"b");
//        System.out.println("a"+30);
//        StringBuilder builder = new StringBuilder();
//        for(int i=0; i<26;i++){
//            char ch = (char)('a'+i);
//            builder.append(ch);
//        }
//     String p = "amma";
//     StringBuilder pl = new StringBuilder(p);
//   pl.reverse();
//        System.out.println(pl);
//
//        System.out.println(pl.toString().equals(p));

        String s = "Let's take LeetCode contest";

  String[] v =s.split(" ");
  String ans="";
  for(String st : v){
      StringBuilder n = new StringBuilder(st);

      n.reverse();
      System.out.println(n);

      ans += n+" ";
  }
        System.out.println(ans.trim());
//        StringBuilder ans = new StringBuilder(s);
//        ans.reverse();
//        String v = ans.toString();

//        System.out.println(Arrays.toString(st));

    }
}
