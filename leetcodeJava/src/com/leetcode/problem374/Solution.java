package com.leetcode.problem374;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Guess Number : "+guessNumber(2126753390));
	}

    public static int guessNumber(int n) {
        return binarySearch(1, n);
    }
    
    public static int binarySearch(long start, long end) {
		long mid = (start + end)/2;
		int res = guess((int)mid);
		if (res<0) {
			return binarySearch(start, mid-1);
		} else if(res>0){
			return binarySearch(mid+1,end);
		}
		else {
			return (int) mid;
		}
	}
    
    public static int guess(int guessNum)
    {
    	int pick = 1702766719;
    	if (pick>guessNum) {
			return 1;
		}
    	else if (pick<guessNum) {
			return -1;
		}
    	else {
			return 0;
		}
    }
}
