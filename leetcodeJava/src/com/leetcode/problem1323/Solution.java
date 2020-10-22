package com.leetcode.problem1323;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("Max number : "+solution.maximum69Number(9669));
	}

    public int maximum69Number (int num) {
        int max = 0;
        String tmpString = ""+num;
        int index = tmpString.indexOf("6");
        if (index==-1) {
			return num;
		}
        else {
			tmpString = tmpString.replaceFirst("6", "9");
			max = Integer.parseInt(tmpString);
		}
        return max;
    }
}
