package com.leetcode.problem1342;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("Number of Steps needed to reduce to 0 : "+solution.numberOfSteps(29));
	}

    public int numberOfSteps (int num) {
    	int count = 0;
    	while (num>0) {
			if (num%2==0) {
				num = num/2;
				count++;
			} else {
				num = num-1;
				count++;
			}
		}
		return count;
    }
}
