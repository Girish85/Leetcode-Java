package com.leetcode.problem1150;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {3,9,9,9,9,9,12,14,15};
		int target = 9;
		System.out.println("Result : "+isMajorityElement(nums, target));
	}

    public static boolean isMajorityElement(int[] nums, int target) {
        return binarySearch(0, nums.length-1, nums, target, (nums.length)/2);
    }
    public static boolean binarySearch(int start, int end, int[] nums, int target, int maxocc) {
    	if((start>end)||!((end-start)>=maxocc))
    		return false;
		int mid = (start + end)/2;
		if (nums[mid]!=target) {
			return false;
		} else {
			if (nums[(start+mid)/2]!=target && nums[(end + mid)/2]!=target) {
				return false;
			}
			if (nums[(start+mid)/2]!=target) {
				return binarySearch(((start+mid)/2)+1, end, nums, target, maxocc);
			}
			else if (nums[(end+mid)/2]!=target) {
				return binarySearch(start, ((end+mid)/2)-1, nums, target, maxocc);
			}
			else {
				return true;
			}
		}
	}
}
