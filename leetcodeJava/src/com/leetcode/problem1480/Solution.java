package com.leetcode.problem1480;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {3,1,2,10,1};
		System.out.println("Running Sums : ");
		int nums2[] = solution.runningSum(nums);
		for (int i = 0; i < nums2.length; i++) {
			System.out.println(nums2[i]);
		}
	}

    public int[] runningSum(int[] nums) {
        int sum[] = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
			sum[i] = sum[i-1]+nums[i];
		}
        return sum;
    }
}
