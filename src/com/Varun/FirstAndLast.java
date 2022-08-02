package com.Varun;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,6,7,8,10};
        int target =7;
    }

    static int[] searchRange(int[] nums, int target) {
        int start = 0 , end = nums.length -1;
        int[] ans ={-1,-1};

        while(start<=end){
            int mid = start + (end -start )/2;
            if(nums[mid]==target)


                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
        }
        return ans;
    }
}
