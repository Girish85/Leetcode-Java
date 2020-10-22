package com.leetcode.problem1365;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {8,1,2,2,3};
		int[] res = solution.smallerNumbersThanCurrent(nums);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

    public int[] smallerNumbersThanCurrent(int[] nums) {
    	int res[] = new int[nums.length];
    	for (int i = 0; i < nums.length; i++) {
    		int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[j]<nums[i]) {
					count++;
				}
			}
			res[i] = count;
		}
		return res;       
    }
}
