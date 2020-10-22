package com.leetcode.problem1119;

public class Solution {

	public static void main(String[] args) {
		String s = "leetcodeisacommunityforcoders";
		String responseString = removeVowels(s);
		System.out.println(responseString);
	}

    public static String removeVowels(String S) {
    	S = S.replaceAll("a", "");
    	S = S.replaceAll("e", "");
    	S = S.replaceAll("i", "");
    	S = S.replaceAll("o", "");
    	S = S.replaceAll("u", "");
		return S;       
    }
}
