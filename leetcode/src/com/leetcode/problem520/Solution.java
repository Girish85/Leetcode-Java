package com.leetcode.problem520;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String word = "FlaG";
		System.out.println("Capital Usage for "+word+" : "+solution.detectCapitalUse(word));
	}
	
	public boolean detectCapitalUse(String word) {
		String upperWord = word.toUpperCase();
		String lowerWord = word.toLowerCase();
		if (word.equals(upperWord)) {
			return true;
		} else if (word.equals(lowerWord)){
			return true;
		}
		else {
			String legal = word.substring(0, 1).toUpperCase();
			String legalWord = legal.concat(word.substring(1, word.length()).toLowerCase());
			if (word.equals(legalWord)) {
				return true;
			} else {
				return false;
			}
		}
    }
}
