package com.leetcode.problem1064;

public class Solution {

	public static void main(String[] args) {
		int A[] = {-5,-2,1,2,4,6,9,12,15,16,17,19,22,25,30};
		//int A[] = {-10,-5,3,4,7,9};
		int index = fixedPoint(A);
		System.out.println("Index : "+index);
	}

    public static int fixedPoint(int[] A) {
        return binarySearch(0, A.length-1, A);
    }
    
    public static int binarySearch(int start, int end, int[] A)
    {
    	if (start>end)
			return -1;
    	int mid = (start + end)/2;
    	if (A[mid]==mid) {
    		if(start==mid)
    			return mid;
    		else
				return binarySearch(start, mid, A);
		}
    	else if (A[mid]>mid)
			return binarySearch(start, mid-1, A);
    	else
			return binarySearch(mid+1, end, A);
    }
}
