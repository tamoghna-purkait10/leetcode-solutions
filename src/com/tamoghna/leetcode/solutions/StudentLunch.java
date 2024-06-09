package com.tamoghna.leetcode.solutions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StudentLunch {

	private static int countStudents(int[] students, int[] sandwiches) {

		Queue<Integer> student = new LinkedList<Integer>();
		Stack<Integer> sandwich = new Stack<Integer>();

		for (int i = (Math.max(students.length, sandwiches.length) - 1); i >= 0; i--) {

			if (i < students.length) {
				student.add(students[i]);
			}

			if (i < sandwiches.length) {
				sandwich.push(sandwiches[i]);
			}
		}

		while (!sandwich.isEmpty() || !student.isEmpty()) {
			
			if (!student.contains(sandwich.peek())) {
				break;
			}
			
			if (student.element() == sandwich.peek()) {
				student.remove();
				sandwich.pop();
			} else {
				int choice = student.remove();
				student.add(choice);
			}
		}

		return student.size();
	}

	public static void main(String[] args) {

		int[] students = { 1, 1, 1, 0, 0, 1 };
		int[] sandwiches = { 1, 0, 0, 0, 1, 1 };

		System.out.println(countStudents(students, sandwiches));
	}

}
