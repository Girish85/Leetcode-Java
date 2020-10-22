package com.leetcode.problem69;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("Sqrt : "+solution.mySqrt(8));
	}

    public int mySqrt(int x) {
    	int response = (int) Math.sqrt(x);
		return response;
    }
}
