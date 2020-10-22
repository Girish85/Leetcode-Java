package com.leetcode.problem412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fizzBuzz(int n) {	
		List<String> sList = new ArrayList<String>();
	for (int i = 1; i <= n; i++) {
		if (i%3==0) {
			if (i%5==0) {
				sList.add("FizzBuzz");
			}
			else {
				sList.add("Fizz");
			}
		} else if (i%5==0) {
			if (i%3==0) {
				sList.add("FizzBuzz");
			}
			else {
				sList.add("Buzz");
			}
		} else {
			sList.add(""+i);
		}
	}
	return sList;
	}
}
