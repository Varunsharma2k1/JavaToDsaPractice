package com.Varun;

import java.util.Arrays;

public class RecursionP {
    public static void main(String[] args) {
//        Pattern2(4,0);
        int[] arr= {4,3,2,9};
//Bubble(arr,arr.length-1,0);
Selection(arr,arr.length,0,0);

        System.out.println(Arrays.toString(arr));
    }
    static void Pattern (int r ,int c){
        if(r==0)
            return;
        if(r>c){
            System.out.print("*");
            Pattern(r,c+1);
        }
        else{
            System.out.println();
            Pattern(r-1,0);
        }
    }
    static void Pattern2 (int r ,int c){
        if(r==0)
            return;
        if(r>c){

            Pattern2(r,c+1);
            System.out.print("*");
        }
        else{

            Pattern2(r-1,0);
            System.out.println();
        }
    }
    static void Bubble (int[] arr,int r ,int c) {
        if (r ==0)
            return ;
        if (c<r) {
            if(arr[c]>arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;

            }
            Bubble(arr, r, c + 1);
        } else {

           Bubble(arr, r - 1, 0);
        }

    }
    static void Selection (int[] arr,int r ,int c,int max) {
        if (r ==0)
            return ;
        if (c<r) {
            if(arr[c]>arr[max]) {
                Selection(arr, r, c + 1,c);

            }
            else{
                Selection(arr,r,c+1,max);
            }

        } else {
                 int temp = arr[max];
                 arr[max]=arr[r-1];
                 arr[r-1]=temp;
            Selection(arr, r - 1, 0,0);
        }

    }
}
