package com.leetcode.problem217;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int nums[] = {1,2,3,1};
		System.out.println("Contains Duplicates : "+solution.containsDuplicate(nums));
	}

    public boolean containsDuplicate(int[] nums) {
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
    }
}
