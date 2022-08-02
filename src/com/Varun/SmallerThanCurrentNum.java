package com.Varun;

import java.util.Arrays;

public class SmallerThanCurrentNum {
    public static void main(String[] args) {
    int[] arr ={6,5,4,8};
    int[] answer = smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(answer));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int[] ans =new int[n];
        for (int i = 0; i <n ; i++) {
            int c=0;
            for (int j =n-1;j>=0;j--){
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            ans[i]=c;
        }
        return ans;
    }
}
