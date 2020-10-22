package com.leetcode.problem665;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {5,2,3,4};
		System.out.println("Non Decreasing order Possibility : "+solution.checkPossibility(nums));
	}

    public boolean checkPossibility(int[] nums) {
    	int count = 0;
    	if (nums.length==1) {
			return true;
		}
    	else {
    		int i=0;
    	while (i<nums.length-1) {
    		if (nums[i]>nums[i+1]) {
				count++;
				nums[i] = nums[i+1];
				i = 0;
			}
    		else {
				i++;
			}
		}
    	if (count>1) {
			return false;
		} else {
			return true;
		}
    }
    }
}
