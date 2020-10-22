package com.leetcode.problem496;

public class Home {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] result = solution.nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4});
		System.out.println("Greatest Next Element array : ");
		for (int i = 0; i < result.length; i++) {
			int j = result[i];
			System.out.print(" "+j+", ");
		}
	}

}
