package com.Varun;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
      int[] a = {6,6,5,4,3,3,3,2,2,1,11,11};


        ArrayList<Integer> ans = new ArrayList<>();

        for(int i =0; i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                ans.add(a[i]);
            }
        }
        ans.add(a[a.length-1]);
        System.out.println(ans);
     }




}
