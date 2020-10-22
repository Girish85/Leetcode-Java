package com.leetcode.problem1189;

import java.util.Collections;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		int count = new Solution().maxNumberOfBalloons("loonbalxballpoon");
		System.out.println("Max occurences of balloon in given String : "+count);
	}

	public int maxNumberOfBalloons(String text) {
		char[] stringChar = text.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>(5);
		int ib=0,ia=0,il=0,io=0,in=0;
		for (int i = 0; i < stringChar.length; i++) {
			switch (stringChar[i]) {
			case 'b':
				ib++;
				break;
			case 'a':
				ia++;
				break;
			case 'l':
				il++;
				break;
			case 'o':
				io++;
				break;
			case 'n':
				in++;
				break;
			default:
				break;
			}
		}
		map.put('b', ib);
		map.put('a', ia);
		map.put('l', il/2);
		map.put('o', io/2);
		map.put('n', in);
		return Collections.min(map.values());
    }
}
