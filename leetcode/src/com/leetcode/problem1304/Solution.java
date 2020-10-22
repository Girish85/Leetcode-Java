package com.leetcode.problem1304;

public class Solution {

	public static void main(String[] args) {
		int n = 1;
		int[] unique = sumZero(n);
		for (int i = 0; i < unique.length; i++) {
			System.out.println(unique[i]);
		}
	}

    public static int[] sumZero(int n) {
        int[] unique = new int[n];
        int range = n/2;
        for (int i = -range,j=0; i <=range&&j<n; i++,j++) {
        	if(i==0)
        	{
        		j--;
        	}
        	else {
    			unique[j] = i;
			}
		}
        return unique;
    }
}
