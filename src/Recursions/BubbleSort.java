package Recursions;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ans = {2,4,1,3};
         Bs(ans, ans.length-1,0 );
        System.out.println(Arrays.toString(ans));
    }
    static void Bs(int[] arr , int r,int c){
    if(r==0)
        return;
    if(c<r){
      if(arr[c]>arr[c+1]){
          int temp = arr[c+1];
          arr[c+1]=arr[c];
          arr[c]=temp;
      }
      Bs(arr,r,c+1);

    }
    else
        Bs(arr,r-1,0);
    }
}
