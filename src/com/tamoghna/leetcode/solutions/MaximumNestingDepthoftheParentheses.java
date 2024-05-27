package com.tamoghna.leetcode.solutions;

import java.util.Stack;

public class MaximumNestingDepthoftheParentheses {
	
	 private static int maxDepth(String s) {
	        char[] braces = s.toCharArray();
	        Stack<Character> brackets = new Stack<Character>();
	        int len = 0, j=0;
	        for (int i =0 ; i< braces.length; i++){
	            if(braces[i] == ')'){
	                brackets.pop();
	                j--;
	            } else if (braces[i] == '(') {
	                brackets.push(braces[i]);
	                j++;
	            }
	            len = Math.max(len,j);
	        }

	        return len;
	    }

	public static void main(String[] args) {
		
		System.out.println("max depth : " + maxDepth("(1+(2*3)+((8)/4))+1"));

	}

}
