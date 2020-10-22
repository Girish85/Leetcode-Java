package com.leetcode.problem412;

import java.util.Iterator;
import java.util.List;

public class Home {

	public static void main(String[] args) {
		Solution solution = new Solution();
		List<String> sList = solution.fizzBuzz(15);
		Iterator<String> sIterator = sList.iterator();
		while (sIterator.hasNext()) {
			System.out.println(sIterator.next());
		}
	}

}
