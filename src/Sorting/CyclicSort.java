package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = {1,3,2,6,5,4};
        int[] ans = CycSort(a);
        System.out.println(Arrays.toString(ans));
    }
    static int[] CycSort(int[] a){
     for(int i =0 ;i<a.length;i++){
         int correct = a[i]-1;
         if(a[i]!=a[correct]){
             swap(a,i,correct);
         }
         else
             i++;
     }
        return a;
    }
    static void swap(int[] arr, int i ,int c){
        int temp = arr[c];
        arr[c]=arr[i];
        arr[i]=temp;
    }
}
