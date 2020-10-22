package com.leetcode.problem657;

public class Solution {

	public static void main(String[] args) {
		String moves = "URDDLU";
		System.out.println(judgeCircle(moves));
	}

    public static boolean judgeCircle(String moves) {
    	int upDown = 0;
    	int rightLeft = 0;
    	for (int i = 0; i < moves.length(); i++) {
			switch (moves.charAt(i)) {
			case 'U':
				upDown++;
				break;
			case 'D':
				upDown--;
				break;
			case 'L':
				rightLeft--;
				break;
			default:
				rightLeft++;
				break;
			}
		}
    	if (upDown==0&&rightLeft==0) {
			return true;
		} else {
			return false;
		}
    }
}
