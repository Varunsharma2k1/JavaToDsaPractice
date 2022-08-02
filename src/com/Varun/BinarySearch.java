package com.Varun;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,10};
        int target =5;
        int ans = binarySearch(arr , target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr , int target){

        boolean isAsc;
        int start = 0 , end = arr.length -1;
        isAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end -start )/2;
            if(arr[mid]==target)
                return mid;
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
           else  {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return end;
    }
}
