package com.Varun;

public class ReduceArray {
    public static void main(String[] args) {
        int[] a = {3,4,2,1,1};
        int c=0;
        for(int i=0;i<a.length;i++){
//            int n=a[i];
            while(a[i]!=0){
                if(a[i]%2==0){
                    a[i]/=2;
                    c++;
                }
                else{
                    a[i]-=1;
                    a[i]/=2;
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
