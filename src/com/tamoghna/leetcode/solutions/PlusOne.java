package com.tamoghna.leetcode.solutions;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		int[] sum;
		while (length > 0) {
			if (length > 0 && digits[length - 1] + 1 == 10) {
				digits[length - 1] = 0;
				length--;
			} else {
				digits[length - 1] += 1;
				break;
			}
		}

		if (digits[0] == 0) {
			sum = new int[digits.length + 1];
			sum[0] = 1;
		} else {
			return digits;
		}

		return sum;
		
		//Alternate
		/*
		 * for (int i = digits.length - 1; i >= 0; i--) { if (digits[i] < 9) {
		 * digits[i]++; return digits; } digits[i] = 0; }
		 * 
		 * digits = new int[digits.length + 1]; digits[0] = 1; return digits;
		 */

	}

	public static void main(String[] args) {

		int[] num = {1,2,4,0};
		int[] sum = plusOne(num);
		for (int i = 0; i < sum.length; i++) {
			System.out.println(sum[i]);
		}
	}

}
