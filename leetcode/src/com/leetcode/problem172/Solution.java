package com.leetcode.problem172;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println("count of zeros : "+solution.trailingZeroes(4581));
	}

	public int trailingZeroes(int n) {
		BigInteger integer = BigInteger.ONE;
		BigDecimal bigDecimal;
        int count = 0;
		for (int i = n; i > 0; i--) {
			 integer = integer.multiply(BigInteger.valueOf(i));
		 }
		 while(integer.remainder(BigInteger.TEN).equals(BigInteger.ZERO)) {
			 count++;
			 integer = integer.divide(BigInteger.TEN);
		   }
		
	   return count;
    }
	
	
}
