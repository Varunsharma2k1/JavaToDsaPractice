package com.Varun;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,3,4};
        int target =6;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        int[] ans= new int[2];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[mid]+numbers[mid+1] == target) {

                ans[0]=mid+1;
                ans[1]=(mid+1)+1;
                break;

            } else if (numbers[mid]+numbers[mid+1] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
