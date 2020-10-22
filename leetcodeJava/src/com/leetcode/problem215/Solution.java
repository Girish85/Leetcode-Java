package com.leetcode.problem215;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int k = 5;
		int[] nums = {2,5,4,6,9,1,0,7,8,4};
		System.out.println(""+k+"th largest element in given array is : "+solution.findKthLargest(nums, k));
	}

    public int findKthLargest(int[] nums, int k) {
    	List<Integer> integers = Arrays.stream(nums).boxed().collect(Collectors.toList());
    	Collections.sort(integers);
		return integers.get(nums.length-k);
    }
}
