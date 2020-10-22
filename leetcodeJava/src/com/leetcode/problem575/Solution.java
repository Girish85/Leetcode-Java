package com.leetcode.problem575;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
	public int distributeCandies(int[] candies) {
		int limit = (candies.length)/2;
		int max = 1;
		Set<Integer> candieSet = new HashSet<Integer>();
		candieSet = Arrays.stream(candies).boxed().collect(Collectors.toSet());
		if (candieSet.size()<=limit) {
			max =  candieSet.size();
		} else {
			max =  limit;
		}
		return max;
    }
}
