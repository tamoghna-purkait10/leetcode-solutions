package com.tamoghna.leetcode.solutions;

/*
 * We can optimize the below solution by 
 * first, sorting the array
 * second, find the length of min and max element
 * third, run a loop till min element length
 * fourth, check first and last element only characterwise
 */

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		
		String prefix = "";
		
				
		if(strs.length == 0) {
			return prefix;
		}
				
		for (int i = 0; i < strs[0].length() ; i++) {
			String current = prefix + String.valueOf(strs[0].charAt(i));
			for(int j = 1; j< strs.length; j++) {
				if(!strs[j].startsWith(current)) {
					return prefix;
				}
			}
			prefix = current;
			
		}
		return prefix;
	}

	public static void main(String[] args) {
		
		String[] strs = {"flower", "flow", "flight"};
		System.out.println(longestCommonPrefix(strs));

	}

}
