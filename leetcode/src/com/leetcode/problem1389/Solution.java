package com.leetcode.problem1389;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int[] result = new int[nums.length];
		result = createTargetArray(nums, index);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
			integers.add(index[i],nums[i]);
		}
        int[] result = integers.stream().mapToInt(Integer::intValue).toArray();
        return result;
        }
}
