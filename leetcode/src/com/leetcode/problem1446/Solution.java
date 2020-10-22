package com.leetcode.problem1446;

public class Solution {
	 public int maxPower(String s) {
		 int power = 1;
		 int maxPower = 1;
		 char[] stringchar = s.toCharArray();
		 int size = stringchar.length;
		 boolean check = true;
		 int i = 0;
		 while (i<size-1) {
			if (stringchar[i] == stringchar[i+1]) {
				power++;
				i++;
			} else {
				if (power>maxPower) {
					maxPower=power;
					power=1;
				}
				power=1;
				i++;
			}
		}
		return maxPower;
	    }
}
