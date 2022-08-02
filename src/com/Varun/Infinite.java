package com.Varun;

public class Infinite {




    public  Infinite(int a){
        int scope=a;
    }



    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,10,12,15};
        int target = 10;
        int answer = ans(arr,target);
        System.out.println(answer);
    }
    static int ans (int[] arr,int target){
        int start=0,end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end= end+(end-start+1)*2;
            start=newStart;
        }

        return Binary(arr,target,start,end);
    }
    static int Binary(int[] arr, int target,int start , int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {

                return mid;

            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
