package com.tamoghna.leetcode.solutions;

public class FirstIndexOfFirstOccurrence {
	
	private static int firstIndexOfFirstOccurrence(String haystack, String needle) {
        
		return haystack.indexOf(needle);
    }

	
	// AlternateSolution
	/*
	 * int haylength=haystack.length(); int needlelength=needle.length();
	 * if(haylength<needlelength) return -1; for(int
	 * i=0;i<=haystack.length()-needle.length();i++){ int j=0;
	 * while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j)) j++;
	 * if(j==needle.length()){ return i; } } return -1;
	 */
    
	public static void main(String[] args) {
		System.out.println(firstIndexOfFirstOccurrence("sadbutsad", "sad"));
	}

}
