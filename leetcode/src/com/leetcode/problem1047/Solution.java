package com.leetcode.problem1047;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String string = "abbaca";
		System.out.println("String after removing Duplicates : "+solution.removeDuplicates(string));
	}

    public String removeDuplicates(String S) {
    	for (int i = 0; i < S.length()-1; i++) {
    		boolean same = false;
			if (S.charAt(i)==S.charAt(i+1)) {
				same = true;
			}
			if (same) {
				String tempString;
				String prefix = S.substring(0,i);
				String postfix = S.substring(i+2, S.length());
				tempString = prefix+postfix;
				S = tempString;
				i=-1;
			}
		}
		return S;
    }
}
