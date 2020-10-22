package com.leetcode.problem1464;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {3,4,5,2};
		System.out.println("Max product is : "+maxProduct(nums));
	}

    public static int maxProduct(int[] nums) {
    	int product = 0;
    	Arrays.sort(nums);
    	int size = nums.length;
    	product = (nums[size-2]-1)*(nums[size-1]-1);
        return product;
    }
}
