package com.leetcode.problem605;

import java.util.Arrays;

public class Solution {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int flowers[] = {0,0,1,0,0,0,1,0,0};
		int n = 3;
		System.out.println("Flowers can be placed : "+solution.canPlaceFlowers(flowers, n));
	}

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	int count = 0;
    	for (int i = 0; i < flowerbed.length; i++) {
    		if (i==0&&i==flowerbed.length-1) {
				if (flowerbed[i]==0) {
					count++;
					flowerbed[i]=1;
				}
			}
			if (i==0) {
				if (flowerbed[i]==0&&flowerbed[i+1]==0) {
					count++;
					flowerbed[i] = 1;
				}
			}
			else if (i==flowerbed.length-1) {
				if (flowerbed[i]==0&&flowerbed[i-1]==0) {
					count++;
					flowerbed[i] = 1;
				}
			}
			else {
				if (flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0) {
					count++;
					flowerbed[i] = 1;
				}
			}
		}
    	if (count>=n) {
			return true;
		} else {
			return false;
		}
    }
}
