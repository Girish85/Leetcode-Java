package com.leetcode.problem1512;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {1,2,3,1,1,3};
		System.out.println("Number of Good Pairs : "+solution.numIdenticalPairs(nums));
	}

    public int numIdenticalPairs(int[] nums) {
        int numPairs = 0;
        for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					numPairs++;
				}
			}
		}
        return numPairs;
    }
}
