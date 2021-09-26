package com.pulot.easy;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    return new int[]{i, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
