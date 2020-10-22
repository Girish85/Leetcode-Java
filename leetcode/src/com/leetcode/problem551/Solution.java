package com.leetcode.problem551;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("Student Eligible : "+solution.checkRecord("PPALLP"));
	}

    public boolean checkRecord(String s) {
    	if (s.contains("LLL")||(s.indexOf('A')!=s.lastIndexOf('A'))) {
			return false;
		} else {
			return true;
		}
    }
}
