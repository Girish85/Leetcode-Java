package com.leetcode.problem1133;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		int A[] = {5,7,3,9,4,9,8,3,1};
		System.out.println(largestUniqueNumber(A));
	}

    public static int largestUniqueNumber(int[] A) {
        Arrays.sort(A);
        for (int i = A.length-1; i >=0; i--) {
            int count = 0;
			for (int j = i-1; j >=0; j--) {
				if (A[i]==A[j]) {
					count++;
				}
			}
			if (count>0) {
				i = i-count;
			}
			else {
				return A[i];
			}
		}
    	return -1;
    }
}
