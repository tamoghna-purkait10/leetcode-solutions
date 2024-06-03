package com.tamoghna.leetcode.solutions;

import java.util.Stack;

public class CrawlerLogFolder {

	private static int minOperations(String[] logs) {
		Stack<String> fileList = new Stack<String>();

		for (String s : logs) {

			if (s.equals("../")) {
				if(!fileList.isEmpty())
					fileList.pop();
			} else if (s.equals("./")) {
			} else {
				fileList.push(s);
			}
		}

		return fileList.size();
	}

	public static void main(String[] args) {

		String[] ops = { "./","../","./" };

		System.out.println("Total file depth : " + minOperations(ops));

	}

}
