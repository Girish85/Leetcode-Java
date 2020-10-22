package com.leetcode.problem1394;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int arr[] = {2,2,3,4,4,4,4};
		System.out.println("Lucky integer : "+solution.findLucky(arr));
	}

    public int findLucky(int[] arr) {
    	List<Integer> luckyIntegers = new ArrayList<Integer>();
    	for (int i = 0; i < arr.length; i++) {
    		int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i]==arr[j])&&(i!=j)) {
					count++;
				}
			}
			if (arr[i]==count) {
				luckyIntegers.add(arr[i]);
			}
		}
    	if (luckyIntegers.size()>0) {
			Collections.sort(luckyIntegers);
			return luckyIntegers.get(luckyIntegers.size()-1);
		}
    	else {
			return -1;
		}
    }
}
