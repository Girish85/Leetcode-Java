package com.leetcode.problem824;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		String S = "I speak Goat Latin";
		System.out.println(toGoatLatin(S));
	}

    public static String toGoatLatin(String S) {
        String[] strings = S.split(" ");
        Set<Character> vowelSet = new HashSet<Character> (Arrays.asList
        		('a','A','e','E','i','I','o','O','u','U'));
        for (int i = 0; i < strings.length; i++) {
        	char c = strings[i].charAt(0);
			if (vowelSet.contains(c)) {
				strings[i] = strings[i]+"ma";
			} else {
				strings[i] = strings[i].substring(1)+c+"ma";
			}
			for (int j = 0; j <=i; j++) {
				strings[i] = strings[i]+"a";
			}
		}
        String respString =  Arrays.toString(strings);
        respString = respString.replaceAll("[\\[\\],]", "");
        return respString;
    }
}
