package com.tamoghna.leetcode.solutions;

import java.util.Stack;

public class BaseballGame {

	private static int calPoints(String[] operations) {

		Stack<Integer> score = new Stack<Integer>();
		int totalScore = 0;

		for (String s : operations) {

			if (s.equals("+")) {
				int last = score.pop();
				int secondLast = score.peek();

				score.push(last);
				score.push(last + secondLast);
			} else if (s.equals("D")) {
				score.push(2 * score.peek());
			} else if (s.equals("C")) {
				score.pop();
			} else {
				score.push(Integer.parseInt(s));
			}
		}

		while (!score.isEmpty()) {
			totalScore += score.pop();
		}

		return totalScore;
	}

	public static void main(String[] args) {
		
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		
		System.out.println("Total score : " + calPoints(ops));
	}

}
