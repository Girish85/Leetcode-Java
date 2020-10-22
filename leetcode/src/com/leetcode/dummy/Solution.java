package com.leetcode.dummy;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class Solution {

public static void main(String stuff[])
{
int n = 34;
System.out.println("Given n : "+n);
int count = 1;
for (int i = 0; i <= n; i++) {
	int q = i;
	while (q>0) {
		int r = q%10;
		switch (r) {
		case 0:
			count++;
			break;
		case 2:
			count++;
			break;
		case 4:
			count++;
			break;
		default:
			break;
		}
		q = q/10;
	}
}
System.out.println("count : "+count);
}

}
