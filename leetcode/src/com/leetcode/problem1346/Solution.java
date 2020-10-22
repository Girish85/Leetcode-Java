package com.leetcode.problem1346;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int nums[] = {10,2,5,3};
		System.out.println("Double exists : "+solution.checkIfExist(nums));
	}

    public boolean checkIfExist(int[] arr) {
    	List<Integer> integers = Arrays.stream(arr).boxed().collect(Collectors.toList());
    	for (int i = 0; i < arr.length; i++) {
    		Integer num = integers.get(i);
    		Integer doubleNum = 2 * num;
			if (integers.contains(doubleNum)&&(integers.indexOf(num)!=integers.lastIndexOf(doubleNum))) {
				return true;
			}
		}
		return false;
    }
}
