package com.leetcode.problem1160;

public class Solution {

	public static void main(String[] args) {
		String[] words = {"cat","bt","hat","tree"};
		String chars = "atach";
		int count = countCharacters(words, chars);
		System.out.println("Count : "+count);
	}

    public static int countCharacters(String[] words, String chars) {
    	int count = 0;
    	for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int length = word.length();
			char[] characters = chars.toCharArray();
			for (int j = 0; j < characters.length; j++) {
				word = word.replaceFirst(""+characters[j]+"", " ");
			}
			word = word.trim();
			if (word.length()==0) {
				count = count+length;
			}
		}
        return count;
    }
}
