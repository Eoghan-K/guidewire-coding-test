package com.eoghan;


import java.util.Arrays;

public class Solution {
    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int solution() {
        // Sort the array in ascending order
        Arrays.sort(arr);
        // set ans to 1. If arr is all negative numbers answer will be 1
        int ans = 1;
        for (int i : arr) {
            // If ans occurs in arr, ans is incremented
            if (ans == i) {
                ans++;
            }
        }
        return ans;
    }

}
