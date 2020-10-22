package com.leetcode.problem506;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int[] nums = {5, 4, 3, 2, 1};
		String[] strings = findRelativeRanks(nums);
		System.out.println("Strings : ");
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

    public static String[] findRelativeRanks(int[] nums) {
        String[] strings = new String[nums.length];
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
		}
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
        	int t=0;
			for (int j = 0; j < nums.length; j++) {
				if (nums2[i]==nums[j]) {
					t = n-j;
				}
			}
			nums2[i] = t;
		}
        for (int i = 0; i < nums2.length; i++) {
			switch (nums2[i]) {
			case 1:
				strings[i]="Gold Medal";
				break;
			case 2:
				strings[i]="Silver Medal";
				break;
			case 3:
				strings[i]="Bronze Medal";
				break;
			default:
				strings[i]=""+nums2[i];
				break;
			}
		}
        return strings;
    }
}
