package com.Varun;

public class SearchROtatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,3,2,1};
        int target = 6;
        int p=0;
        int s = 0,e=nums.length-1;
        while(s<e){
            int mid = s +(e-s)/2;
            if(nums[mid]==target){
                System.out.println(mid);
            return;}
            if(nums[mid]>nums[mid+1])
                p=mid;
            if(nums[s]>=target)
                s=p+1;
            else
                e=p-1;

        }
        System.out.println(s);
    }
}
