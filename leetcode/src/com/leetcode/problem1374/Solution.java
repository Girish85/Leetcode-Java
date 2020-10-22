package com.leetcode.problem1374;

public class Solution {

	public static void main(String[] args) {
		int n = 8;
		System.out.println(generateTheString(n));
	}

    public static String generateTheString(int n) {
        String s = null;
        char[] sChar = new char[n];
        if (n%2==0) {
			sChar[0] = 'z';
			for (int i = 1; i < n; i++) {
				sChar[i] = 'p';
			}
		} else {
			for (int i = 0; i < n; i++) {
				sChar[i] = 'p';
			}
		}
        s = new String(sChar);
        return s;
    }
}
