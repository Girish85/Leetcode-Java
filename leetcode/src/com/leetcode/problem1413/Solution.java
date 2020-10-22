package com.leetcode.problem1413;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {-3,2,-3,4,2};
		System.out.println("Min Start Value : "+solution.minStartValue(nums));
	}

    public int minStartValue(int[] nums) {
    	int startValue = 1;
    	int stepSum = startValue;
    	int i = 0;
    	while (i<nums.length) {
			stepSum = stepSum+nums[i];
			if (stepSum<1) {
				int difference = 1 - stepSum;
				startValue = startValue+difference;
				stepSum = startValue;
				i=0;
			} else {
				i++;
			}
		}
		return startValue;
    }
}
