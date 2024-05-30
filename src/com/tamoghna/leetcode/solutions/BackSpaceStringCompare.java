package com.tamoghna.leetcode.solutions;

import java.util.Stack;

public class BackSpaceStringCompare {

	private static boolean backspaceCompare(String s, String t) {

		Stack<Character> ss = new Stack<Character>();
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < Math.max(s.length(), t.length()); i++) {

			if (i < s.length() && s.charAt(i) != 0 && s.charAt(i) != '#') {
				ss.push(s.charAt(i));
			} else if (i < s.length() && s.charAt(i) != 0 && s.charAt(i) == '#' && !ss.empty()) {
				ss.pop();
			}

			if (i < t.length() && t.charAt(i) != 0 && t.charAt(i) != '#') {
				st.push(t.charAt(i));
			} else if (i < t.length() && t.charAt(i) != 0 && t.charAt(i) == '#' && !st.empty()) {
				st.pop();
			}
		}

		return (ss.toString().equalsIgnoreCase(st.toString()));

	}

	private static boolean backspaceCompare1(String S, String T) {
		return stackSolution(S).equals(stackSolution(T));
	}

	private static String stackSolution(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : str.toCharArray()) {

			if (c != '#') {
				stack.push(c);

			} else if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		return stack.toString();
	}

	public static void main(String[] args) {
		System.out.println(backspaceCompare("a#c", "b"));
		System.out.println(backspaceCompare1("a#c", "b"));
	}

}
