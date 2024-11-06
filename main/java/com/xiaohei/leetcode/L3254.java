package com.xiaohei.leetcode;

import java.util.Arrays;

public class L3254 {
    public static void main(String[] args) {
        int[] nums = {1,3,4};
        int k = 2;
        int[] results = resultsArray(nums, k);
        System.out.println(Arrays.toString(results));
    }

    public static int[] resultsArray(int[] nums, int k) {
        int end = nums.length - k;
        int[] results = new int[end + 1];
        for (int i = 0; i <= end; i++) {
            int eng = nums[i] - 1;
            for (int j = 0; j < k; j++) {
                if (nums[i + j] - eng == 1) {
                    eng = nums[i + j];
                } else {
                    eng = -1;
                    break;
                }
            }
            results[i] = eng;
        }
        return results;
    }
}
