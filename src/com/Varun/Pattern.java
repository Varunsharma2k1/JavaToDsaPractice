package com.Varun;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
//        int i=1;
//     while(i<=n){
//         int j=1;
//         int spaces=0;
//         for(int k=1;k<=n-i;k++){
//             System.out.print(" ");
//         }
//
//         while(j<=i){
//             System.out.print(j);
//             j++;
//         }
//         System.out.println();
//         i++;
//     }
  pattern6(n);
    }

    static void pattern6(int n) {
        int l =n/2+1;
        for(int i = 1 ; i<=l;i++){
            for(int spaces=1;spaces<=n-i-2;spaces++){
                System.out.print(" ");
            }
            for(int col = 1;col<=i*2-1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        int k=0;
        for(int i = l+1 ; i<=n;i++){
            for(int spaces=1;spaces<=2-(n-i);spaces++){
                System.out.print(" ");
            }

            for(int col = 1;col<l+1-k;col++){
                System.out.print("*");
            }
            k+=2;
            System.out.println();
        }


    }

    static void pattern5(int n) {
        for(int row = 1; row<=n;row++){

        for(int spaces = 1; spaces<=n-row;spaces++){
            System.out.print(" ");
        }
        int k =row;
        for(int col =1;col<=row;col++){
            System.out.print(k);
            k++;
        }

        for(int col =2*row-2;col>row-1;col--){

            System.out.print(col);
        }

            System.out.println();
    }}

    static void pattern2(int n){
        int i=n;
        while(i>=1){
            int j=1;
            while(j<=i){
                System.out.print(i);
                j++;
            }
            System.out.println();
            i--;
        }
    }
    static void pattern3(int n){
        for(int i= 1;i<=n;i++){
            int spaces=0;
            for(spaces=1;spaces<=n-i;spaces++){
                System.out.print(" ");
            }

            for(int j = i ;j<=n-spaces-1;j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
