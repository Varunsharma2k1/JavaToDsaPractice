package com.Varun;

public class Occurrence {
    public static void main(String[] args) {
        int[] a = {1,2,3,3,3,4,4,4,4,4};
        int i=0;
        while(i<a.length-1){
            int c=1;
            int j=i+1;
            while(  j< a.length && a[i]==a[j]){
                c++;
                j++;
            }
            System.out.println( a[i] +" Occur " + c + " times");
            i=j;

        }

    }
}
