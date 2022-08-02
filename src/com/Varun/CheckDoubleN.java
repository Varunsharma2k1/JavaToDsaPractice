package com.Varun;

import java.util.Arrays;

public class CheckDoubleN {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
//        Arrays.sort(arr);
//        int target,flag=1;
//        for (int i = 0; i <arr.length-1 ; i++) {
//            target = arr[i]*2;
//            for (int j = i+1; j <arr.length ; j++) {
//                if(arr[j]==target){
//                    System.out.println("true");
//                flag=2;
//            }}
//        }
//        if(flag==1)
//            System.out.println("false");
        boolean ans =  checkIfExist(arr);
        System.out.println(ans);
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int target,flag=1;
        for (int i = 0; i <arr.length-1 ; i++) {
            target = arr[i]*2;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]==target) {
                    flag = 2;
                    return true;
                }
            }
        }
        return false;
    }
}
