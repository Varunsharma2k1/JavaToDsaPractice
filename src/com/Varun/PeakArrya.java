package com.Varun;

import java.util.Arrays;

public class PeakArrya {
    public static void main(String[] args) {
//        int[] a = {3,4,2,5,1};
//       Arrays.sort(a);
////       for(int i=1;i<a.length-3;i+=2){
////           int temp = a[i];
////           a[i]=a[i+1];
////           a[i+1]=temp;
////       }
//        System.out.println(Arrays.toString(a));

        int n =6;
        int k=2;
        int c=0;

            while(k<n){
                k++;
                c++;
            }
            while(k>1){
                k--;
                c++;
            }
        System.out.println(c);
    }
}
