package com.leetcode.problem414;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {3,2,1,5,8,6,8,6,5};
		System.out.println("Third Maximum number is : "+solution.thirdMax(nums));
	}

    public int thirdMax(int[] nums) {
    	Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
    	List<Integer> numList = numSet.stream().collect(Collectors.toList());
    	Collections.sort(numList);
    	int size = numList.size();
    	if (numList.size()>2) {
			return numList.get(size-3);
		} else {
			return numList.get(size-1);
		}
    }
}
