package com.tamoghna.leetcode.solutions;

import java.util.HashMap;

public class IntersectionOfTwoLinkedList {

	
	//TC - O(n) SC - O(n)
	private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashMap<ListNode, Integer> llMap = new HashMap<ListNode, Integer>();

		ListNode l1 = headA;
		ListNode l2 = headB;

		while (l1 != null || l2 != null) {
			if (l1 != null && llMap.put(l1, l1.val) != null) {
				return l1;
			}
			if (l2 != null && llMap.put(l2, l2.val) != null) {
				return l2;
			}
			l1 = l1 != null ? l1.next : null;
			l2 = l2 != null ? l2.next : null;
		}
		return null;
	}

	public static void main(String[] args) {

		ListNode joinedNode = new ListNode(8);
		joinedNode.next = new ListNode(4);
		joinedNode.next.next = new ListNode(5);

		ListNode newNode1 = new ListNode(4);
		newNode1.next = new ListNode(1);
		newNode1.next.next = joinedNode;

		ListNode newNode2 = new ListNode(5);
		newNode2.next = new ListNode(6);
		newNode2.next.next = new ListNode(1);
		newNode2.next.next.next = joinedNode;

		getIntersectionNode(newNode1, newNode2);

	}

}
