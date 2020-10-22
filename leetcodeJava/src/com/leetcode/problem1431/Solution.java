package com.leetcode.problem1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		System.out.println("Result : "+solution.kidsWithCandies(candies, extraCandies));
	}

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    	List<Boolean> candieList = new ArrayList<Boolean>();
    	int max = 0;
    	for (int i = 0; i < candies.length; i++) {
			if (candies[i]>max) {
				max = candies[i];
			}
		}
    	for (int i = 0; i < candies.length; i++) {
			if ((candies[i]+extraCandies)>=max) {
				candieList.add(true);
			} else {
				candieList.add(false);
			}
		}
        return candieList;
    }
}
