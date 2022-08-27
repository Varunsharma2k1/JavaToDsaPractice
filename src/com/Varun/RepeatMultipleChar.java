package com.Varun;

import java.util.Arrays;

public class RepeatMultipleChar {
    public static void main(String[] args) {
        String s = "ccccbbbaaaa";
//        String[] sa = st.split("");
//        Arrays.sort(sa);
//        String s = String.join("",sa);

//        print yeh krwana hai, a2b4c3
        String ans ="";
        int i=0;
      while(i<s.length()-1){
            int c=1;
            int j=i+1;
            while(  j< s.length() && s.charAt(i)==s.charAt(j)){
                c++;
                j++;
            }
          ans = ans + s.charAt(i)+ c;
            i=j;

        }
        System.out.println(ans);
    }
}
