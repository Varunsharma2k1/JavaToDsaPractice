package com.Varun;

import java.util.Arrays;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {


//        int temp=0;
//        for(int j=0;j<arr.length;j++){
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//            }
//        }}
//        System.out.println(Arrays.toString(arr));
//   for(int i=1;i<arr.length;i++){
//       int j=i-1;
//       int temp=arr[i];
//       while(j>=0&&arr[j]>temp){
//           arr[j+1]=arr[j];
//           j--;
//       }
//       arr[j+1]=temp;
//   }


//      int temp =arr[0];
//        for (int i = 1; i <=arr.length-1 ; i++) {
//            arr[i-1]=arr[i];
//        }
//
//        arr[arr.length-1]=temp;
//        int d=2;
//        int[] da = new int[2];
//        for(int i=0;i<2;i++){
//            da[i]=arr[i];
//        }
//        int k=0;
//        for(int i=0;i<arr.length;i++){
//            if(i<arr.length-d)
//            arr[i]=arr[i+d];
//            else
//                arr[i]=da[k++];
//        }
//        int[] arr1={6,2,4};
//        int [] arr2= {7,5,6};
//        int sum=0;
//        for(int i=0;i<arr1.length;i++){
//            sum=sum*10+arr1[i];
//        }
//        int y=0;
//        for(int i=0;i<arr2.length;i++){
//            y=y*10+arr2[i];
//        }
//        int ans= sum+y,t=0;
//        int[] answer = new int[arr1.length+arr2.length]
//        while(ans>0){
//            t=ans/10;
//            answer
//        }
//String str = "abc def";
//        StringBuilder str1= new StringBuilder();
//        int si= 0;
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)==' '){
//                for(int j=si;j<i;j++){
//                    str1.append(str.charAt(i));
//                }
//                si=i+1;
//            }
//        }
//        System.out.println(str1);
//        int[][] mat = {{6,9},{8,5},{9,2}};
//
//        for(int i =0;i<mat.length;i++){
//            int sum=0;
//            for(int j=0;j<mat[i].length;j++){
//                sum+=mat[i][j];
//            }
//            System.out.print(sum+" ");

//            int arr[][]=new int[4][5];
//            for(int i=0;i<5;i++)
//            {
//                arr[i][0]=2;
//            }
//            System.out.print(arr[3][0]);
        int[][] arr = { { 1, 2 }, { 3, 4 } };
        System.out.println(arr[0][0]+arr[1][1]);

    }
}
