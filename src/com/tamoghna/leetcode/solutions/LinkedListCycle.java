package com.tamoghna.leetcode.solutions;

import java.util.HashMap;

public class LinkedListCycle {

	// TC = O(n) SC = O(1)
	private static boolean hasCycle(ListNode head) {
		HashMap<ListNode, Integer> llMap = new HashMap<ListNode, Integer>();

		ListNode curr = head;

		while (curr != null) {
			if (llMap.put(curr, curr.val) != null) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}

	public static void main(String[] args) {

		ListNode cycleNode = new ListNode(2);
		
		ListNode newNode = new ListNode(3);
		newNode.next = cycleNode;
		newNode.next.next = new ListNode(0);
		newNode.next.next.next = new ListNode(-4);
		newNode.next.next.next.next = cycleNode;

		System.out.println(hasCycle(newNode));
	}

}
