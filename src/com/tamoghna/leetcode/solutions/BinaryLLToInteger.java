package com.tamoghna.leetcode.solutions;

public class BinaryLLToInteger {

	private static int getDecimalValue(ListNode head) {

		String s = "";
		while (head != null) {
			s = s + Integer.toString(head.val);
			head = head.next;
		}

		return Integer.parseInt(s, 2);
	}

	private static int getDecimalValue1(ListNode head) {

		int res = 0;

		while (head != null) {
			res = res * 2 + head.val;
			head = head.next;
		}

		return res;
	}

	private static int getDecimalValue2(ListNode head) {

		int res = 0;

		while (head != null) {
			res = res << 1 | head.val;
			head = head.next;
		}

		return res;
	}

	public static void main(String[] args) {

		ListNode newNode = new ListNode(1);
		newNode.next = new ListNode(0);
		newNode.next.next = new ListNode(0);
		newNode.next.next.next = new ListNode(1);
		newNode.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next = new ListNode(1);
		newNode.next.next.next.next.next.next.next = new ListNode(1);
		newNode.next.next.next.next.next.next.next.next = new ListNode(1);
		newNode.next.next.next.next.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);
		newNode.next.next.next.next.next.next.next.next.next.next.next.next.next.next = new ListNode(0);

		System.out.println(getDecimalValue(newNode));
		System.out.println(getDecimalValue1(newNode));
		System.out.println(getDecimalValue2(newNode));


	}

}
