package com.leetcode.problem860;

import com.leetcode.problem860.Solution;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] bills = {5,10,5,10,20};
		System.out.println("Lemonades Distribution : "+solution.lemonadeChange(bills));
	}

	public boolean lemonadeChange(int[] bills) {
		int cfive,cten;
		cfive = cten = 0;
		if ((bills.length>0)&&(bills[0]==5)) {
			for (int i = 0; i < bills.length; i++) {
				if (bills[i]==5) {
					cfive++;
				}
				else if (bills[i]==10) {
					cten++;
					if (cfive>0) {
						cfive--;
					} else {
						return false;
					}
				}
				else {
					if (cfive>0) {
						if (cten>0) {
							cten--;
							cfive--;
						}
						else if (cfive>2) {
							cfive = cfive - 3;
						}
						else {
							return false;
						}
					}
					else {
						return false;
					}
				}
			}
			return true;
		} else {
			return false;
		}
    }
}
