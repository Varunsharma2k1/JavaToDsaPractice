package com.Varun;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//        int n= in.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i]=in.nextInt();
//        }
//      int t=0;
//        boolean[] check = new boolean[n-1];
//      for(int j=0;j<n;j++)
//      {
//         t=arr[j];
//         if(check[t]==true) {
//             check[t] = false;
//             System.out.println(t);
//         }
//          else
//             check[t]=true;
//
//        }

//         int[] arr1 ={10,10};
//         int[] arr2 = {10};
//         for(int i = 0 ;i< arr1.length;i++){
//             for (int j = 0; j <arr2.length ; j++) {
//                 if(arr2[j]==arr1[i]){
//                     System.out.print(arr2[j]+" ");
//                     arr2[j]=-1;
//             break;
//                 }}
//   int[] arr= {1 ,2 ,3, 4, 5 ,6, 7 };
//   int x= 12,count=0;
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = i+1;j<arr.length-1;j++){
//                {
//                    for(int k =j+1;k<arr.length;k++){
//                        if(arr[i]+arr[j]+arr[k]==x)
//                            count++;
//                    }
//                }
//
//        }
//
//
//         }
//        System.out.println(count);
        int[] arr = {1,1,0,0,1,0};
         int[] arr1 = new int[arr.length];
        int end = arr.length-1;
        int start = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==1){
                arr[end]=arr[i];
                end--;
            }
            else{
                arr[start]=arr[i];
                start++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
