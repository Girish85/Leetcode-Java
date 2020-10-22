package com.leetcode.problem728;

import java.util.List;

public class Home {

	public static void main(String[] args) {
		Solution solution = new Solution();
		List<Integer> integers = solution.selfDividingNumbers(7, 85);
		for (int i = 0; i < integers.size(); i++) {
			System.out.println(integers.get(i));
		}
		//integers.stream().forEach(s->System.out.println(", "+s));
	}

}
