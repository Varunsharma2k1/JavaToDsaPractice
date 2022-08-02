package com.Varun;

public class CheckArrayRotation {
    public static void main(String[] args) {
        int[] arr={5,6,1,2,3,4};
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid-1]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        System.out.println(arr.length-start);
    }
}
