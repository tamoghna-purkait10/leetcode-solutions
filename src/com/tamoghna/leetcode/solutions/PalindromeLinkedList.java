package com.tamoghna.leetcode.solutions;

import java.util.Stack;

// TC O(n) SC - O(n)
public class PalindromeLinkedList {

	private static boolean isPalindrome(ListNode head) {
		ListNode curr = head;
		Stack<Integer> num = new Stack<Integer>();

		while (curr != null) {
			num.add(curr.val);
			curr = curr.next;
		}

		while (head != null) {
			if(head.val != num.pop()) {
				return false;
			}
			head = head.next;
		}

		return true;
	}

	public static void main(String[] args) {

		ListNode newNode = new ListNode(1);
		newNode.next = new ListNode(0);
		newNode.next.next = new ListNode(1);

		System.out.println(isPalindrome(newNode));
	}

}
