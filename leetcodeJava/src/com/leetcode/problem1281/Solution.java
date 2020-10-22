package com.leetcode.problem1281;

public class Solution {

	public static void main(String[] args) {
		int n = 234;
		System.out.println("Difference is : "+subtractProductAndSum(n));
	}

    public static int subtractProductAndSum(int n) {
        String s = ""+n;
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
			digits[i] = Integer.parseInt(""+s.charAt(i));
		}
        int product = 1;
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
			product = product*digits[i];
			sum = sum+digits[i];
		}
        return product-sum;
    }
}
