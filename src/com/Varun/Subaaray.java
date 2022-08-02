package com.Varun;

import java.util.Arrays;

public class Subaaray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int  sum = 0;
        for (int k = 0; k < arr.length; k++) {

            for (int i = k; i < arr.length; i++) {

                int[] ans = new int[i + 1];
                int c=0;
                for (int s = k; s <= i; s++) {
                    ans[c] = arr[s];
c++;


                }
                System.out.print(Arrays.toString(ans));
                int max = ans[0];
                for (int j = 0; j < ans.length; j++) {

                    max = Math.max(max, ans[j]);

                }
                System.out.print(" " + max);
                sum += max;
                System.out.println();
            }

        }

        System.out.println(sum);
    }
}

