package com.leetcode.problem1544;

public class Solution {

	public static void main(String[] args) {
		String s = "abBcDdCb";
		System.out.println(makeGood(s));
	}

    public static String makeGood(String s) {
        String temp = s;
        int length = s.length();
        int i=0;
        while (length>1) {
        	String s1 = s.substring(i,i+1);
        	String s2 = s.substring(i+1, i+2);
			if (s1.toLowerCase().equals(s2.toLowerCase())) {
				if (s1.equals(s2)) {
					i++;
					length--;
				} else {
					temp = s.substring(0, i)+s.substring(i+2);
					s = temp;
					i=0;
					length = s.length();
				}
			} else {
				i++;
				length--;
			}
		}
        return temp;
    }
}
