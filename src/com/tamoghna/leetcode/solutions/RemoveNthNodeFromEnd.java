package com.tamoghna.leetcode.solutions;

public class RemoveNthNodeFromEnd {

	//TC O(n) SC O(1)
	private static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode slow = head;
		ListNode fast = head;

		for (int i = 0; i < n; i++) {  //give fast pointer a head start by n
			fast = fast.next;
		}
		if (fast == null) {
			return head.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return head;
	}

	public static void main(String[] args) {
		
		ListNode newNode = new ListNode(0);
		newNode.next = new ListNode(3);
		newNode.next.next = new ListNode(1);
		newNode.next.next.next = new ListNode(0);
		newNode.next.next.next.next = new ListNode(4);
		newNode.next.next.next.next.next = new ListNode(5);
		newNode.next.next.next.next.next.next = new ListNode(2);
		newNode.next.next.next.next.next.next.next = new ListNode(0);
		
		removeNthFromEnd(newNode, 3);

	}

}
