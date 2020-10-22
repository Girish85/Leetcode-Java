package com.leetcode.problem728;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
    	List<Integer> integers = new ArrayList<Integer>();
    	for (int i = left; i <= right; i++) {
    		boolean divisible = true;
    		int k = i;
			while ((k>0)) {
				int l = k%10;
				if (l==0) {
					divisible=false;
					break;
				}
				if (i%l!=0) {
					divisible = false;
					break;
				}
				k = k/10;
			}
			if (divisible) {
				integers.add(i);
			}
		}
		return integers;
    }
}
