package Recursions;

public class MaxMinArray {
    public static void main(String[] args) {
        int[] a = {1,11,3,-55,-4,8,6};
       int ans= Answer2(a,1,a[0]);
        System.out.println(ans);

    }
    public static  int Answer(int[] arr, int i, int max){
        if(i>arr.length-1)
            return max;
        if(arr[i]>max)
            return Answer(arr,i+1,arr[i]);
        else
            return Answer(arr,i+1,max);

    }
    public static  int Answer2(int[] arr, int i, int min){
        if(i>arr.length-1)
            return min;
        if(arr[i]<min)
            return Answer2(arr,i+1,arr[i]);
        else
            return Answer2(arr,i+1,min);

    }


}
