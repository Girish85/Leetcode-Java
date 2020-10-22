package com.leetcode.problem1005;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] nums = {4,2,3};
		int k = 1;
		System.out.println("Largest Sum after Negations : "+solution.largestSumAfterKNegations(nums, k));
	}

    public int largestSumAfterKNegations(int[] A, int K) {
    	/*List<Integer> integers = Arrays.stream(A).boxed().collect(Collectors.toList());
    	Collections.sort(integers);
    	for(int i=1;i<=K;i++)
    	{
    		Integer negInteger = -(integers.get(0));
    		System.out.println(negInteger);
    		integers.remove(0);
    		integers.add(negInteger);
    		Collections.sort(integers);
    	}
    	for (Iterator iterator = integers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
    	int sum = 0;
    	sum = integers.stream().reduce(0, Integer::sum);
		return sum;    */
    	Arrays.sort(A);
    	for (int i = 0; i < K; i++) {
			A[0] = -A[0];
			Arrays.sort(A);
		}
    	int sum = 0;
    	for (int i = 0; i < A.length; i++) {
			sum = sum+A[i];
		}
    	return sum;
    }
}
