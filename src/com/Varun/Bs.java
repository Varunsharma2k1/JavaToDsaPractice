package com.Varun;

public class Bs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 10, 12, 15};
        int target = 55;
        int ans = Binary(arr, target);
        System.out.println(ans);
    }

    static int Binary(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {

                return mid;

            } else if (arr[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
