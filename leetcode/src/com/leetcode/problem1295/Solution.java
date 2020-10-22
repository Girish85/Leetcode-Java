package com.leetcode.problem1295;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int nums[] = {12,345,2,6,7896};
		System.out.println("Numbers with even digits : "+solution.findNumbers(nums));
	}

    public int findNumbers(int[] nums) {
        String[] numStrings = new String[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
			numStrings[i] = ""+nums[i];
		}
        for (int i = 0; i < numStrings.length; i++) {
			if ((numStrings[i].length())%2==0) {
				count++;
			}
		}
        return count;
    }
}
