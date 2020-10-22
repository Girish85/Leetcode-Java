package com.leetcode.problem788;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int n = 10;
		System.out.println("Valid Count : "+rotatedDigits(n));
	}

    public static int rotatedDigits(int N) {
        int count = 0;
        for (int j = 2; j <= N; j++) {
        	boolean valid = false;
        	int i = j;
			while (i>1) {
				int tmp = i%10;
				i = i/10;
				if (tmp==2||tmp==5||tmp==9||tmp==6) {
					valid = true;
				} else if(tmp==1||tmp==0||tmp==8){
					continue;
				}
				else {
					valid = false;
					break;
				}
			}
			if (valid) {
				count++;
			}
		}
        return count;
    }
}
