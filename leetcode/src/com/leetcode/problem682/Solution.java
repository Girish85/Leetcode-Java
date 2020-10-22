package com.leetcode.problem682;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String ops[] = {"5","2","C","D","+"}; 
		System.out.println("Sum : "+solution.calPoints(ops));
	}

    public int calPoints(String[] ops) {
        int sum = 0;
        List<Integer> validIntegers = new ArrayList<Integer>();
    	for (int i = 0; i < ops.length; i++) {
			ListIterator<Integer> iterator = validIntegers.listIterator(validIntegers.size());
			switch (ops[i]) {		
			case "D":	
				if (iterator.hasPrevious()) {
					int res = iterator.previous();
					sum = sum+ 2*res;
					validIntegers.add(2*res);
				}
				break;				
			case "C":
				if (iterator.hasPrevious()) {
					int index = iterator.previousIndex();
					int val = iterator.previous();
					sum = sum - val;
					validIntegers.remove(index);
				}
				break;				
			case "+":
				if (iterator.hasPrevious()) {
					int prev1 = iterator.previous();
					if (iterator.hasPrevious()) {
						int prev2 = iterator.previous();
						int round = prev1+prev2;
						sum = sum+round;
						validIntegers.add(round);
					}
				}
				break;			
			default:
				int j = Integer.parseInt(ops[i]);
				validIntegers.add(j);
				sum = sum + j;
				break;
			}
		}
    	return sum;
    }
}
