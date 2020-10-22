package com.leetcode.problem697;

import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {1,2,2,3,1,4,2};
		System.out.println(findShortestSubArray(nums));
	}

    public static int findShortestSubArray(int[] nums) {
    	int count = nums.length;
    	int max = 1;
    	int diff = 1;
    	HashMap<Integer, Integer> degrees = new HashMap<Integer, Integer>();
    	HashMap<Integer, Integer> startIndex = new HashMap<Integer, Integer>();
    	HashMap<Integer, Integer> endIndex = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
    		int key = nums[i];
			if (degrees.containsKey(key)) {
				degrees.replace(key, degrees.get(key)+1);
				endIndex.replace(key, i);
			} else {
				degrees.put(key, 1);
				startIndex.put(key, i);
				endIndex.put(key, i);
			}
		}
    	for (int i = 0; i < nums.length; i++) {
    		int key = nums[i];
    		int value = degrees.get(key);
    		int range = endIndex.get(key)-startIndex.get(key)+1;
			if (value>max) {
				max = value;
				diff = range;
			}
			else if (value == max && range < diff) {
				max = value;
				diff = range;
			}
		}
        return diff;
    }
}
