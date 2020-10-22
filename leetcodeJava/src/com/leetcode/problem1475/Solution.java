package com.leetcode.problem1475;

public class Solution {

	public static void main(String[] args) {
		int[] prices = {8,4,6,2,3};
		int[] finalPrices = finalPrices(prices);
		System.out.println("Final Prices : ");
		for (int i = 0; i < finalPrices.length; i++) {
			System.out.println(finalPrices[i]);
		}
	}

    public static int[] finalPrices(int[] prices) {
        int[] pricesWithDiscount = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
			int price = prices[i];
			int discount = 0;
			for (int j = i+1; j < prices.length; j++) {
				if (prices[i]>=prices[j]) {
					discount = prices[j];
					break;
				}
			}
			pricesWithDiscount[i] = price - discount;
		}
        return pricesWithDiscount;
    }
}
