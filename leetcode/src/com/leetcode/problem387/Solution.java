package com.leetcode.problem387;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String string = "loveleetcode";
		System.out.println("First unique character index : "+solution.firstUniqChar(string));
	}

    public int firstUniqChar(String s) {
        /*int count[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)&&(i!=j)) {
					 count[i]++;
				}
			}
			if (count[i]==0) {
				return i;
			}
		}
    	return -1;*/
    	for (int i = 0; i < s.length(); i++) {
    		String tmp = ""+s.charAt(i);
    		if (s.indexOf(tmp)==s.lastIndexOf(tmp)) {
				return i;
			}
    	}
    	return -1;
    }
}
