package com.leetcode.problem704;

public class Solution {

	public static void main(String[] args) {
		int nums[] = {2,3,5,8,11,14,16,20,22,25,28};
		int target = 8;
		System.out.println("Index : "+search(nums, target));
	}

    public static int search(int[] nums, int target) {
        int index = binarySearch(0, nums.length-1, nums, target);
        return index;
    }
    
    public static int binarySearch(int start, int end, int nums[], int target)
    {
    	if (start>end) {
			return -1;
		}
    	int mid = (start+end)/2;
    	if (nums[mid]==target) {
			return mid;
		} else if(nums[mid]>target){
			return binarySearch(start, mid-1, nums, target);
		}
		else 
			return binarySearch(mid+1, end, nums, target);
    }
}
