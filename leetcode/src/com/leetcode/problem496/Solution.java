package com.leetcode.problem496;

public class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int size = nums1.length;
		int[] greatnums = new int[size];
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i]==nums2[j]) {
					greatnums[i] = -1;
					for (int j2 = j; j2 < nums2.length; j2++) {
						if (nums1[i]<nums2[j2]) {
							greatnums[i] = nums2[j2];
							break;
						}
					}
				}
			}
		}
		return greatnums;
    }
}
