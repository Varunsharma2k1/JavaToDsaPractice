package com.Varun;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,7,9,3,2,1};
       int start = 0, end = arr.length-1;

       int ans = Ma(arr,start,end);
        System.out.println(ans);
    }
    static int Ma(int[] arr,int start, int end){
        while(start<end){
            int mid= start +(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else
            {
                start=mid+1;
            }

        }
        return start;
//        or return end both are true
    }


}
