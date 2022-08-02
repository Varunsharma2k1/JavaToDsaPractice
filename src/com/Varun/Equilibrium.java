package com.Varun;

public class Equilibrium {
    public static void main(String[] args) {
 int[] arr ={1, 2, 3};
    int sum=0;
    for(int i=1;i<arr.length;i++){
        sum+=arr[i-1];
        int leftsum=0;
      for(int j=i+1;j<arr.length;j++){

          leftsum+=arr[j];
      }
      if(leftsum==sum){
          System.out.println(i);
          return;
    }}
    
}
}

