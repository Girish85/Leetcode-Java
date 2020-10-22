package com.leetcode.problem1309;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {

	public static void main(String[] args) {
		String string = "10#11#12";
		System.out.println(freqAlphabets(string));
	}

    public static String freqAlphabets(String s) {
       /* String decoded = null;
        char[] alphabets = new char[] {
        		'$','a','b','c','d','e','f',
        		'g','h','i','j','k','l','m',
        		'n','o','p','q','r','s','t',
        		'u','v','w','x','y','z'
        };
        List<Character> cList = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)=='1'||s.charAt(i)=='2')&&(i<s.length()-2)) {
				if (s.charAt(i+2)=='#') {
					int k = Integer.parseInt(""+s.charAt(i)+s.charAt(i+1));
					cList.add(alphabets[k]);
					i = i+2;
				} else {
					int k = Integer.parseInt(""+s.charAt(i));
					cList.add(alphabets[k]);
				}
			} else {
				int k = Integer.parseInt(""+s.charAt(i));
				cList.add(alphabets[k]);
			}
		}  
        decoded = cList.stream().map(String::valueOf).collect(Collectors.joining());
        return decoded;*/
    	String decoded = "";
    	for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)=='1'||s.charAt(i)=='2')&&(i<s.length()-2)&&(s.charAt(i+2)=='#')) {
					int k = Integer.parseInt(""+s.charAt(i)+s.charAt(i+1));
					char c = (char) ('a'+(char)k-1);
					decoded = decoded+c;
					System.out.println(c);
					i = i+2;
			} else {
				int k = Integer.parseInt(""+s.charAt(i));
				char c = (char) ('a'+(char)k-1);
				decoded = decoded+c;
			}
		} 
    	return decoded;
    }
}
