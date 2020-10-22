package com.leetcode.problem1556;

public class Solution {

	public static void main(String[] args) {
		int n = 12456789;
		System.out.println(thousandSeparator(n));
	}

    public static String thousandSeparator(int n) {
    	String tmp = ""+n;
    	String s = "";
		int count = 0;
		int length = tmp.length();
    	while(length>3)
        {
            s = "."+tmp.substring(length-3, length)+s;
            length = length-3;
        }
		return tmp.substring(0,length)+s;       
    }
}
