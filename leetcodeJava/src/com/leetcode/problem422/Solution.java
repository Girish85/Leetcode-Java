package com.leetcode.problem422;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words.add("abcd");
		words.add("bnrt");
		words.add("crm");
		words.add("dt");
		System.out.println(validWordSquare(words));
	}

    public static boolean validWordSquare(List<String> words) {
        boolean valid = false;
        try {
        	for(int i=0;i<words.size();i++)
            {
            	String s1 = words.get(i);
            	String s2 = "";
            	for (int j = 0; j < s1.length(); j++) {
            		s2 = s2+words.get(j).charAt(i);
				}
            	if (s1.equals(s2)) {
					valid = true;
				}
            	else {
					return false;
				}
            }
		} catch (Exception e) {
			return false;
		}
    	return valid;
    }
}
