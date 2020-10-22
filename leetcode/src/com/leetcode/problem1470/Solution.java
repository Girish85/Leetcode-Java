package com.leetcode.problem1470;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		System.out.println("Array after shuffle : ");
		int[] shuffledArray = solution.shuffle(nums, n);
		for (int i = 0; i < shuffledArray.length; i++) {
			System.out.println(shuffledArray[i]);
		}
	}

    public int[] shuffle(int[] nums, int n) {
    	int size = nums.length;
    	int[] shuffledArray = new int[nums.length];
    	for (int i = 0,j = 0; (i < size)&&(j < size); i++,j=j+2) {
			shuffledArray[j] = nums[i];
			shuffledArray[j+1] = nums[i+n];
		}
        return shuffledArray;
    }
}
