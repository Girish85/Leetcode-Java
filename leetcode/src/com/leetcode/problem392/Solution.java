package com.leetcode.problem392;

public class Solution {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}

    public static boolean isSubsequence(String s, String t) {
    	int index = 0;
        for (int i = 0; i < s.length(); i++) {
        	index = binarySearch(index, t.length()-1, t, s.charAt(i));
        	if (index==-1) {
				return false;
			}
        	index++;
        }
        return true;
    }
    
    public static int binarySearch(int start, int end, String t, char s){
    	int index = -1;
    	for (int i = start; i < t.length(); i++) {
			if (t.charAt(i)==s) {
				return i;
			}
		}
    	return index;
    }
}
