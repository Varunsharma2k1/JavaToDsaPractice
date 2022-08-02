package com.Varun;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums= {1,1,2,3,3,4,4,8,8};
        int s = 0,e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
           if((mid%2==0 && nums[mid]==nums[mid+1]) || (mid%2!=0 && nums[mid]==nums[mid-1]))
               s=mid+1;
           else
               e=mid-1;

        }
        System.out.println(nums[s]);
    }
}
