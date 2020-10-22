package com.leetcode.problem1518;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
    	if (numExchange>numBottles) {
			return numBottles;
		} else if (numExchange==numBottles) {
			return numBottles+1;
		}
    	else {
			int maxBottles = numBottles;
			int emptyConverted = numBottles/numExchange;
			int emptyBottles = numBottles%numExchange;
    		boolean check = true;
    		while (check) {
        		if ((emptyConverted+emptyBottles)<numExchange) {
					maxBottles = maxBottles+emptyConverted;
					return maxBottles;
				} 
        		else if ((emptyConverted+emptyBottles)==numExchange) {
					return maxBottles+emptyBottles+emptyConverted+1;
				}
        		else {
					maxBottles = maxBottles+emptyConverted;
					emptyConverted = (emptyConverted+emptyBottles)/numExchange;
					emptyBottles = (emptyConverted+emptyBottles)%numExchange;
				}
			}    
    		return maxBottles;
		}
    }
}
