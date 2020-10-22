package com.leetcode.problem344;

public class Solution {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
	}

    public static void reverseString(char[] s) {
    	int n = s.length;
        for (int i = 0; i < n/2; i++) {
			char x = s[i];
			s[i] = s[n-i-1];
			s[n-i-1] = x;
		}
    }
}
