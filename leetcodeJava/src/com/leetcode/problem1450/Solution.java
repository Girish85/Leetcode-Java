package com.leetcode.problem1450;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] startTime = {9,8,7,6,5,4,3,2,1};
		int[] endTime = {10,10,10,10,10,10,10,10,10};
		int queryTime = 5;
		System.out.println("Number of Students working at given time : "+solution.
				busyStudent(startTime, endTime, queryTime));
	}

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
			if ((startTime[i]>queryTime)||(endTime[i]<queryTime)) {
				continue;
			}
			else {
				count++;
			}
		}
        return count;
    }
}
