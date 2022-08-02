package com.Varun;
import java.util.Arrays;
public class GreatestNoOfCandies {
    public static void main(String[] args) {
     int[] arr= {9};

     int s = arr[0],j=1;
        if(arr.length<2) {
           if(arr[0]==9){
               int[] ans = new int[arr.length+1];
               s=arr[0];
               s++;
               String temp = Integer.toString(s);

               for (int i = 0; i < temp.length(); i++) {
                   ans[i] = temp.charAt(i)-'0';
               }
               System.out.println(Arrays.toString(ans));
           }
            else{
            s = arr[0];
            s++;
            arr[0] = s;


            System.out.println(Arrays.toString(arr));
        }}
        else {
            for (int i = 0; i < arr.length && j <= arr.length - 1; i++) {
                s = ((s * 10) + arr[j]);
                j++;
            }
            s++;
            String temp = Integer.toString(s);

            for (int i = 0; i < temp.length(); i++) {
                arr[i] = temp.charAt(i)-'0';
            }
            System.out.println(Arrays.toString(arr));
        }



    }


}
