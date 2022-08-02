package Recursions;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Sum(arr);
    }
    static void Sum(int[] arr){
        if(arr.length<1)
            return;
           int k=0;
        int[] ans = new int[arr.length-1];
        for(int i=0 ;i< arr.length-1;i++){
            ans[k]=arr[i]+arr[i+1];
           k++;
        }

        Sum(ans);
        System.out.println(Arrays.toString(arr));
    }
}
