package com.tamoghna.leetcode.solutions;

public class ClimbStairs {

	public static int climbStairs(int n) {

		int n1 = 1, n2 = 2, numberOfWays = 0;
		
		if(n==1 || n==2) {
			return n;
		}

		for (int i = 2; i < n; i++) {
			numberOfWays = n1 + n2;
			n1 = n2;
			n2 = numberOfWays;

		}

		return numberOfWays;

	}

	public static void main(String[] args) {
		System.out.println(climbStairs(5));
	}

}
