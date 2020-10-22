package com.leetcode.problem28;

import com.leetcode.problem28.Solution;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String haystackString = "hello";
		String needleString = "ll";
		System.out.println("Needle is part of Haystack at : "+solution.strStr(haystackString, needleString));
	}

	public int strStr(String haystack, String needle) {
		return haystack.indexOf(needle);        
    }
}
