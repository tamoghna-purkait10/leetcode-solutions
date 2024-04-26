package com.tamoghna.leetcode.solutions;

public class LengthOfLastWord {

	private static int lengthOfLastWord(String s) {
		String[] words = s.split(" ");
		return words[words.length - 1].length();
	}

	// Alternate Solution (Improved)
	/*
	 * private static int lengthOfLastWord(String s) { int length = 0; s = s.trim();
	 * for (int i = s.length() - 1; i > -0; i--) { if (s.charAt(i) != ' ') {
	 * length++; } else { break; } } return length; }
	 */

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
	}

}
