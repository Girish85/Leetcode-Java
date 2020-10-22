package com.leetcode.problem680;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String string = "ebcbbececabbacecbbcbe";
		System.out.println("Valid : "+solution.validPalindrome(string));
	}

    public boolean validPalindrome(String s) {
    	int count = 0;
    	int i = 0;
    	while (i<s.length()) {
    		System.out.println(s.charAt(i)+" , "+s.charAt(s.length()-1-i));
			if (s.charAt(i)==s.charAt(s.length()-1-i)) {
				i++;
			} else {
				if (s.charAt(i)==s.charAt(s.length()-2-i)) {
					count++;
					String tmpString = s.substring(0, s.length()-1-i)+s.substring(s.length()-i, s.length());
					s = tmpString;
					i=0;
				}
				else if (s.charAt(i+1)==s.charAt(s.length()-1-i)) {
					count++;
					String tmpString = s.substring(0, i)+s.substring(i+1, s.length());
					s = tmpString;
					i=0;
				}
				else {
					count+=2;
					return false;
				}
			}
		}
		 if(count<=1) {
			 return true;
		 }
		 else 
		return false;
    	
    }  
}
