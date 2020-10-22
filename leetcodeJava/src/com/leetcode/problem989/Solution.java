package com.leetcode.problem989;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int A[] = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
		int k = 516;
		List<Integer> resultList = solution.addToArrayForm(A, k);
		for (Iterator iterator = resultList.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.print(integer);
		}
	}

    public List<Integer> addToArrayForm(int[] A, int K) {
    	List<Integer> integers = new ArrayList<Integer>();
    	int l = 0;
    	long sum = 0;
    	int sum2 = 0;
    	int n = A.length;
    	for (int i = 0; i < n-1; i++) {
			sum = (sum + A[i])*10;
		}
    	sum = sum + A[n-1];
    	long result = sum + K;
    	while (result>0) {
    		sum2 = (int) (result%10);
			integers.add(sum2);
			result = result/10;
			l++;
		}
    	Collections.reverse(integers);
		return integers;
    }
}
